package ru.spb.sfgpetclinic.data;

import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;

@Setter
@Getter
public class Owner extends Person implements Comparator<Owner> {

    @Override
    public int compare(Owner o1, Owner o2) {
        return (o1.getId() > o2.getId()) ? 0 : -1;
    }
}
