package ru.spb.sfgpetclinic.controllres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.spb.sfgpetclinicdata.service.VetService;


@Controller
@RequestMapping("/vets")
public class VetController {

    private final VetService vetService;

    @Autowired
    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/","/vet","/vet.html"})
    public String vetEntryPoint(Model model){
        model.addAttribute("vets",vetService.findAll());
        return "/vets/vet";
    }

}
