package ru.spb.sfgpetclinicdata.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
public class Owner extends Person implements Comparator<Owner> {

    private String address;
    private String city;
    private String telephone;
    private Set<Pet> pets;

    public Owner() {
        this.pets = new HashSet<>();
    }

    @Override
    public int compare(Owner o1, Owner o2) {
        return (o1.getId() > o2.getId()) ? 0 : -1;
    }
}
