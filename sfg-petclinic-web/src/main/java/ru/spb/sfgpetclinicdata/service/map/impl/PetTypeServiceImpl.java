package ru.spb.sfgpetclinicdata.service.map.impl;

import org.springframework.stereotype.Service;
import ru.spb.sfgpetclinicdata.data.PetType;
import ru.spb.sfgpetclinicdata.service.PetTypeService;

import java.util.Set;

@Service
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
        return super.save(object);
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
