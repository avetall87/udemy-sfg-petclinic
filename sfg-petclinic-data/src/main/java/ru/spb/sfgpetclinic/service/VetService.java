package ru.spb.sfgpetclinic.service;

import ru.spb.sfgpetclinic.data.Vet;

import java.util.Set;

public interface VetService {
    Set<Vet> findAll();

    Vet findById(Long id);

    Vet save(Vet vet);
}
