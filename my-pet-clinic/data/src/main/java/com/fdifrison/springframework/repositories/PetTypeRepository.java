package com.fdifrison.springframework.repositories;

import com.fdifrison.springframework.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
