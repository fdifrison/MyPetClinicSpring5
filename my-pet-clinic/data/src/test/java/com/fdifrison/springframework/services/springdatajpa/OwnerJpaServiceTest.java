package com.fdifrison.springframework.services.springdatajpa;

import com.fdifrison.springframework.model.Owner;
import com.fdifrison.springframework.repositories.OwnerRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@Slf4j
@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {


    @Mock
    private OwnerRepository ownerRepository;

    @InjectMocks
    private OwnerJpaService service;

    public static final String LAST_NAME = "Frison";
    public static final Long ID = 1L;

    Owner owner;

    @BeforeEach
    void setUp() {
        owner = Owner.builder().id(ID).lastName(LAST_NAME).build();
    }

    @Test
    void findAll() {
        Set<Owner> newOwners = new HashSet<>();
        newOwners.add(owner);
        when(ownerRepository.findAll()).thenReturn(newOwners);
        Set<Owner> owners = service.findAll();
        assertEquals(1, owners.size());
    }

    @Test
    void findById() {
        when(ownerRepository.findById(ID)).thenReturn(Optional.of(owner));
        Owner newOwner = service.findById(ID);
        assertEquals(owner, newOwner);
    }

    @Test
    void save() {
        when(ownerRepository.save(owner)).thenReturn(owner);
        Owner newOwner = service.save(owner);
        assertEquals(newOwner, owner);
    }

    @Test
    void delete() {
        service.delete(owner);
        verify(ownerRepository).delete(owner);
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByLastName() {
        when(ownerRepository.findByLastName(LAST_NAME)).thenReturn(owner);
        Owner newOwner = service.findByLastName(LAST_NAME);
        assertEquals(LAST_NAME, newOwner.getLastName());
    }
}