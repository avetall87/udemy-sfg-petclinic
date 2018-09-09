package ru.spb.sfgpetclinicdata.service.map.impl;

import org.springframework.stereotype.Service;
import ru.spb.sfgpetclinicdata.data.Owner;
import ru.spb.sfgpetclinicdata.service.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMapImpl extends AbstarctMapService<Owner, Long> implements OwnerService {

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }
}
