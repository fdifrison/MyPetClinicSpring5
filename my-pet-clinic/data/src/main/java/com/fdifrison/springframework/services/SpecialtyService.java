package com.fdifrison.springframework.services;

import com.fdifrison.springframework.model.Specialty;
import org.springframework.stereotype.Service;

@Service
public interface SpecialtyService extends CrudService<Specialty, Long> {
}
