package ru.spb.sfgpetclinic.service.map.impl;

import ru.spb.sfgpetclinic.data.Vet;
import ru.spb.sfgpetclinic.service.VetService;

import java.util.Set;

public class VetServiceMapImpl extends AbstarctMapService<Vet, Long> implements VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
