package com.fdifrison.springframework.repositories;

import com.fdifrison.springframework.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
}
