package ru.spb.sfgpetclinic.controllres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets","/vets/vet","vets/vet.html"})
    public String vetEntryPoint(){
        return "/vets/vet";
    }

}
