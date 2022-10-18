package com.fdifrison.springframework.services.springdatajpa;

import com.fdifrison.springframework.model.Vet;
import com.fdifrison.springframework.repositories.VetRepository;
import com.fdifrison.springframework.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class VetJpaService implements VetService {

    @Autowired
    private VetRepository vetRepository;

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vet= new HashSet<>();
        vetRepository.findAll().forEach(vet::add);
        return vet;
    }

    @Override
    public Vet findById(Long id) {
        return vetRepository.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet object) {
        vetRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
}
