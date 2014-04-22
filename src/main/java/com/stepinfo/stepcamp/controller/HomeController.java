package com.stepinfo.stepcamp.controller;

import com.stepinfo.stepcamp.model.Garage;
import com.stepinfo.stepcamp.service.BateauService;
import com.stepinfo.stepcamp.service.MotoService;
import com.stepinfo.stepcamp.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;


@Controller
public class HomeController {

    private Garage garage;

    @Autowired
    private VoitureService voitureService;
    @Autowired
    private MotoService motoService;
    @Autowired
    private BateauService bateauService;

    @RequestMapping({"/", "/home"})
    public String goHome(Model model) {

        SimpleDateFormat date_connexion = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat heure_connexion = new SimpleDateFormat("hh:mm");

        Date date_jour = new Date();


        // Informations sur le garage
        if (!model.containsAttribute("garage")) {
            garage = new Garage();
            model.addAttribute("garage", garage);
            model.addAttribute("nomGarage", garage.getNom());
            model.addAttribute("adresse1Garage", garage.getAdresse1());
            model.addAttribute("adresse2Garage", garage.getAdresse2());
            model.addAttribute("telephoneGarage", garage.getTelephone());

            // Informations de l'utilisateur
            model.addAttribute("date_connexion", date_connexion.format(date_jour));
            model.addAttribute("heure_connexion", heure_connexion.format(date_jour));
        }

        // Nombre de véhicules présents
        model.addAttribute("nbVoitures", voitureService.getListeVoitures().size());
        model.addAttribute("nbMotos", motoService.getListeMotos().size());
        model.addAttribute("nbBateaux", bateauService.getListeBateaux().size());

        return "home";
    }

    // Login page
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView login(@RequestParam(value = "error", required = false) String error, @RequestParam(value = "logout", required = false) String logout) {
        ModelAndView model = new ModelAndView();
        if (error != null) {
            model.addObject("error", "Les informations saisies ne sont pas correctes.");
        }

        if (logout != null) {
            model.addObject("msg", "Déconnexion réussie avec succès");
        }
        model.setViewName("login");

        return model;
    }

    @RequestMapping({"/testDataTable"})
    public String goTestDataTable(Model model) {
        return "testDataTable";
    }
}
