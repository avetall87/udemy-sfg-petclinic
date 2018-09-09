package ru.spb.sfgpetclinicdata.service.map.impl;

import ru.spb.sfgpetclinicdata.data.BaseEntity;

import java.util.*;

import static org.apache.commons.collections.CollectionUtils.isEmpty;

public abstract class AbstarctMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
       return map.get(id);
    }

    T save(T object){

        if(object!= null){

            if (object.getId() == null){
                object.setId(getNexId());
            }

            map.put(object.getId(),object);
        }else {
            throw new IllegalArgumentException("Object cannot be null !");
        }

        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNexId(){

        Long nextId = 0L;

        if (!isEmpty(map.keySet())){
            nextId = Collections.max(map.keySet())+1;
        }else {
            nextId=nextId+1;
        }

        return nextId;
    }
}
