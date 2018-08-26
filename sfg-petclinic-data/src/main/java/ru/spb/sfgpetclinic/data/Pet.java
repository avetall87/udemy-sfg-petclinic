package ru.spb.sfgpetclinic.data;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Pet extends BaseEntity{

    private PetType petType;
    private Owner owner;
    private LocalDateTime localDateTime;

}
