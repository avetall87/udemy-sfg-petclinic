package ru.spb.sfgpetclinicdata.service.map.impl;

import org.springframework.stereotype.Service;
import ru.spb.sfgpetclinicdata.data.Speciality;
import ru.spb.sfgpetclinicdata.service.SpecialitiesService;

import java.util.Set;

@Service
public class SpecialitiesServiceMapImpl extends AbstarctMapService<Speciality, Long> implements SpecialitiesService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
