package ru.spb.sfgpetclinicdata.data;

import lombok.*;

import java.util.Comparator;
import java.util.Set;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Owner extends Person implements Comparator<Owner> {

    private String address;
    private String city;
    private String telephone;

    Set<Pet> pets;

    @Override
    public int compare(Owner o1, Owner o2) {
        return (o1.getId() > o2.getId()) ? 0 : -1;
    }
}
