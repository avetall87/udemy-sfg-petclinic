package ru.spb.sfgpetclinic.service.map.impl;

import org.springframework.stereotype.Service;
import ru.spb.sfgpetclinic.data.Pet;
import ru.spb.sfgpetclinic.service.PetService;

import java.util.Set;

@Service
public class PetServiceMapImpl extends AbstarctMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return null;
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
