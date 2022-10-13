package com.fdifrison.springframework.services.map;

import com.fdifrison.springframework.model.PetType;
import com.fdifrison.springframework.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

    public PetTypeServiceMap() {
    }

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
