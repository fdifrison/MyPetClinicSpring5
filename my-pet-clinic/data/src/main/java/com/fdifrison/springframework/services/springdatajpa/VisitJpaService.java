package com.fdifrison.springframework.services.springdatajpa;

import com.fdifrison.springframework.model.Visit;
import com.fdifrison.springframework.repositories.VisitRepository;
import com.fdifrison.springframework.services.VisitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


@Service
@Profile("jpa")
public class VisitJpaService implements VisitService {

    @Autowired
    private VisitRepository visitRepository;

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits= new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long id) {
        return visitRepository.findById(id).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        visitRepository.deleteById(id);
    }
}
