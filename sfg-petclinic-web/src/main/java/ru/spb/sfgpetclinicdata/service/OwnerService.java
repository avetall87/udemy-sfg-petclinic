package ru.spb.sfgpetclinicdata.service;

import ru.spb.sfgpetclinicdata.data.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
