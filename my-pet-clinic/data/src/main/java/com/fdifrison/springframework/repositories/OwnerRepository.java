package com.fdifrison.springframework.repositories;

import com.fdifrison.springframework.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
