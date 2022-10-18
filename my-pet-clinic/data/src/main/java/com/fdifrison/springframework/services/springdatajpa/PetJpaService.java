package com.fdifrison.springframework.services.springdatajpa;

import com.fdifrison.springframework.model.Pet;
import com.fdifrison.springframework.repositories.PetRepository;
import com.fdifrison.springframework.services.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile("jpa")
public class PetJpaService implements PetService {

    @Autowired
    private PetRepository petRepository;

    @Override
    public Set<Pet> findAll() {
        return (Set<Pet>) petRepository.findAll();
    }

    @Override
    public Pet findByID(Long id) {
        return petRepository.findById(id).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        petRepository.deleteById(id);
    }
}
