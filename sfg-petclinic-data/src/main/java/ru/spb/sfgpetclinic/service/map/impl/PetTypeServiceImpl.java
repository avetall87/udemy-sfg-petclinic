package ru.spb.sfgpetclinic.service.map.impl;

import ru.spb.sfgpetclinic.data.PetType;
import ru.spb.sfgpetclinic.service.PetTypeService;

import java.util.Set;

public class PetTypeServiceImpl extends AbstarctMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }
}
