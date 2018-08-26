package ru.spb.sfgpetclinic.service;

import ru.spb.sfgpetclinic.data.Owner;

import java.util.Set;

public interface OwnerService {

    Set<Owner> findAll();

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save(Owner owner);
}
