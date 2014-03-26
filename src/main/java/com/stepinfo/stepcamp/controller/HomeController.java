package com.stepinfo.stepcamp.controller;

import com.stepinfo.stepcamp.model.Garage;
import com.stepinfo.stepcamp.service.AvionService;
import com.stepinfo.stepcamp.service.BateauService;
import com.stepinfo.stepcamp.service.MotoService;
import com.stepinfo.stepcamp.service.VoitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    private Garage garage;

    @Autowired
    private VoitureService voitureService;
    @Autowired
    private MotoService motoService;
    @Autowired
    private BateauService bateauService;
    @Autowired
    private AvionService avionService;

	@RequestMapping({"/", "/home"})
	public String goHome(Model model) {
        if (!model.containsAttribute("garage")) {
            garage = new Garage();
            model.addAttribute("garage", garage);
            model.addAttribute("nomGarage", garage.getNom());
            model.addAttribute("adresse1Garage", garage.getAdresse1());
            model.addAttribute("adresse2Garage", garage.getAdresse2());
            model.addAttribute("telephoneGarage", garage.getTelephone());
        }
        model.addAttribute("nbVoitures", voitureService.getListeVoitures().size());
        model.addAttribute("nbMotos", motoService.getListeMotos().size());
        model.addAttribute("nbBateaux", bateauService.getListeBateaux().size());
        model.addAttribute("nbAvions", avionService.getListeAvions().size());
		return "home";
	}
	
}
