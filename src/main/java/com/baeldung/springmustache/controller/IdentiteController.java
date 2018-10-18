package com.baeldung.springmustache.controller;

import com.baeldung.springmustache.model.Identite;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class IdentiteController {
    @GetMapping("/identite")
    public ModelAndView displayIdentite(Map<String,Object> model){
        Identite identite =new Identite();
        identite.setListePrenom("julien");
        identite.setNomNaissance("cordenod");
        Identite identite2 =new Identite();
        identite2.setListePrenom("sylvain");
        identite2.setNomNaissance("jouardet");

        List<Identite>identites=new ArrayList<>();
        identites.add(identite);
        identites.add(identite2);

        model.put("identites", identites);

        return new ModelAndView("index", model);

    }

}
