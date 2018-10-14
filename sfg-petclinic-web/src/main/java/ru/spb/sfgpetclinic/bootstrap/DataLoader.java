package ru.spb.sfgpetclinic.bootstrap;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.spb.sfgpetclinicdata.data.Owner;
import ru.spb.sfgpetclinicdata.data.Pet;
import ru.spb.sfgpetclinicdata.data.PetType;
import ru.spb.sfgpetclinicdata.data.Vet;
import ru.spb.sfgpetclinicdata.service.OwnerService;
import ru.spb.sfgpetclinicdata.service.PetService;
import ru.spb.sfgpetclinicdata.service.VetService;

import java.time.LocalDateTime;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetService petService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetService petService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petService = petService;
    }

    @Override
    @SneakyThrows
    public void run(String... args) {

        Owner ivanov = new Owner();
        ivanov.setId(1L);
        ivanov.setFirstName("Иван");
        ivanov.setLastName("Иванов");

        ownerService.save(ivanov);

        Owner petrov = new Owner();
        petrov.setId(2L);
        petrov.setFirstName("Петр");
        petrov.setLastName("Петров");

        System.out.println("Owners is loaded !");

        ownerService.save(petrov);

        Pet dog = new Pet();
        dog.setPetType(PetType.builder().name("верный").build());
        dog.setLocalDateTime(LocalDateTime.now());
        dog.setOwner(ivanov);
        petService.save(dog);

        Pet cat = new Pet();
        cat.setPetType(PetType.builder().name("пушистик").build());
        cat.setLocalDateTime(LocalDateTime.now());
        cat.setOwner(petrov);
        petService.save(cat);

        System.out.println("Pets is loaded !");

        Vet sidorov = new Vet();
        sidorov.setId(1L);
        sidorov.setFirstName("Евгений");
        sidorov.setLastName("Сидоров");

        vetService.save(sidorov);

        Vet taburetkin = new Vet();
        taburetkin.setId(2L);
        taburetkin.setFirstName("Вениамин");
        taburetkin.setLastName("Табуреткин");

        vetService.save(taburetkin);

        System.out.println("Vets is loaded !");

    }
}
