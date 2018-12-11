package ru.spb.sfgpetclinicdata.service.map.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import ru.spb.sfgpetclinicdata.data.Owner;
import ru.spb.sfgpetclinicdata.data.Pet;
import ru.spb.sfgpetclinicdata.service.OwnerService;
import ru.spb.sfgpetclinicdata.service.PetService;
import ru.spb.sfgpetclinicdata.service.PetTypeService;

import java.util.Set;

import static org.apache.commons.lang3.ObjectUtils.allNotNull;

@Service
public class OwnerServiceMapImpl extends AbstarctMapService<Owner, Long> implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    @Autowired
    public OwnerServiceMapImpl(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

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
        if (object == null) {
            return null;
        }

        if (allNotNull(object.getPets())) {
            object.getPets().forEach(this::savePetType);
        }

        return super.save(object);
    }

    private void savePetType(Pet pet) {
        Assert.isNull(pet.getPetType(), "Pet type required !");
        if (pet.getPetType().getId() == null) {
            pet.setPetType(petTypeService.save(pet.getPetType()));
        }

        if (pet.getId() == null) {
            Pet savedPet = petService.save(pet);
            savedPet.setId(savedPet.getId());
        }
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
