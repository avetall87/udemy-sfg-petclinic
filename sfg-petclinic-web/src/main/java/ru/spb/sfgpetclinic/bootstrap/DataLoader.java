package ru.spb.sfgpetclinic.bootstrap;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import ru.spb.sfgpetclinic.data.Owner;
import ru.spb.sfgpetclinic.data.Vet;
import ru.spb.sfgpetclinic.service.OwnerService;
import ru.spb.sfgpetclinic.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
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

        ownerService.save(petrov);

        System.out.println("Owners is loaded !");

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
