package ru.spb.sfgpetclinic.controllres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/vets")
public class VetController {

    @RequestMapping({"","/","/vet","/vet.html"})
    public String vetEntryPoint(){
        return "/vets/vet";
    }

}
