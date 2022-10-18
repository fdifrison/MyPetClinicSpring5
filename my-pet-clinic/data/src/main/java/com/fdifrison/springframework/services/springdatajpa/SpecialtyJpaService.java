package com.fdifrison.springframework.services.springdatajpa;

import com.fdifrison.springframework.model.Specialty;
import com.fdifrison.springframework.repositories.SpecialtyRepository;
import com.fdifrison.springframework.services.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;



@Service
@Profile("jpa")
public class SpecialtyJpaService implements SpecialtyService {

    @Autowired
    private SpecialtyRepository specialtyRepository;

    @Override
    public Set<Specialty> findAll() {
        return (Set<Specialty>) specialtyRepository.findAll();
    }

    @Override
    public Specialty findByID(Long id) {
        return specialtyRepository.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty object) {
        specialtyRepository.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        specialtyRepository.deleteById(id);
    }
}
