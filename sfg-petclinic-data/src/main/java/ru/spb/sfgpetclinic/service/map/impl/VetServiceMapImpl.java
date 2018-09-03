package ru.spb.sfgpetclinic.service.map.impl;

import org.springframework.stereotype.Service;
import ru.spb.sfgpetclinic.data.Vet;
import ru.spb.sfgpetclinic.service.VetService;

import java.util.Set;

@Service
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
        return super.save(object);
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
