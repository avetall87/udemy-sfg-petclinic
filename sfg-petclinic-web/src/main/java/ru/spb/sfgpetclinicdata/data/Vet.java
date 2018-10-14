package ru.spb.sfgpetclinicdata.data;


import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Vet extends Person {
    private Set<Speciality> specialties;

    protected Set<Speciality> getSpecialtiesInternal() {
        if (this.specialties == null) {
            this.specialties = new HashSet<>();
        }
        return this.specialties;
    }

    public int getNrOfSpecialties() {
        return getSpecialtiesInternal().size();
    }

}
