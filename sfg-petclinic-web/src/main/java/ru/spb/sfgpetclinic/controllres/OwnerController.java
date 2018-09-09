package ru.spb.sfgpetclinic.controllres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.spb.sfgpetclinicdata.service.OwnerService;

@Controller
@RequestMapping("/owners")
public class OwnerController {

    private final OwnerService ownerService;

    @Autowired
    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"","/","/owner","/owner.html"})
    public String vetEntryPoint(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "/owners/owner";
    }
}
