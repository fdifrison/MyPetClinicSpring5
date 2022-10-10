package com.fdifrison.springframework.services;

import com.fdifrison.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    Owner findByLastName(String lastName);

}
