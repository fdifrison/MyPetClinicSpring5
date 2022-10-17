package com.fdifrison.springframework.repositories;

import com.fdifrison.springframework.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
