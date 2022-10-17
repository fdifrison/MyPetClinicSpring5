package com.fdifrison.springframework.repositories;

import com.fdifrison.springframework.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
