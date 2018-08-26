package ru.spb.sfgpetclinic.service;

import ru.spb.sfgpetclinic.data.Pet;

import java.util.Set;

public interface PetService {
    Set<Pet> findAll();

    Pet findById(Long id);

    Pet save(Pet pet);
}
