package ru.spb.sfgpetclinicdata.data;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PetType extends BaseEntity {
    private String name;
}
