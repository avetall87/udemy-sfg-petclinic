package ru.spb.sfgpetclinic.service;

import ru.spb.sfgpetclinic.data.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
