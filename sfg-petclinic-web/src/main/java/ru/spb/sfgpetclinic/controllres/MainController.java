package ru.spb.sfgpetclinic.controllres;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping({"","/","index","index.html"})
    public String entryPoint(){
        return "index";
    }

}
