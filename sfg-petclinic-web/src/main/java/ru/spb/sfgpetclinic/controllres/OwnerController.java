package ru.spb.sfgpetclinic.controllres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    @RequestMapping({"","/","/owner","/owner.html"})
    public String vetEntryPoint(){
        return "/owners/owner";
    }
}
