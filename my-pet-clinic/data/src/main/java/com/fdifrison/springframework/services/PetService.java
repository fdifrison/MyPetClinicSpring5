package com.fdifrison.springframework.services;

import com.fdifrison.springframework.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet owner);

    Set<Pet> findAll();

}
