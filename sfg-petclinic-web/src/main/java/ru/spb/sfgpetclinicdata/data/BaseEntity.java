package ru.spb.sfgpetclinicdata.data;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
public class BaseEntity implements Serializable {

    private Long id;

    public boolean isNew(){
        return this.id == null;
    }

}
