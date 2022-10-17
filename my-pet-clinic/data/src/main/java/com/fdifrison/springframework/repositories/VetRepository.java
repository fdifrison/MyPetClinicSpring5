package com.fdifrison.springframework.repositories;

import com.fdifrison.springframework.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
