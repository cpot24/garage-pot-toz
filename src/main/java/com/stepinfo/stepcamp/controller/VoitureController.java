package com.stepinfo.stepcamp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.stepinfo.stepcamp.model.Voiture;
import com.stepinfo.stepcamp.service.VoitureService;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class VoitureController {

    @Autowired
    private VoitureService voitureService;

    private int idVoitureMaj = 0;
    private List<String> choixOptions = new ArrayList<String>();
    private List<String> choixMarques = new ArrayList<String>();

    /***********
     * Voiture *
     ***********/

    //Affichage de la liste des voitures
    @RequestMapping("/voiture")
    public String listeVoiture(Model model) {
        model.addAttribute("listeVoiture", voitureService.getListeVoitures());
		return "listeVoiture";
	}

    //Préparation de l'ajout d'une voiture
    @RequestMapping(value = "/prepareAjout", method = RequestMethod.GET)
	public String prepareAjoutVoiture(Voiture voiture, Model model) {
        model.addAttribute("voiture", voitureService.getNouvelleVoiture());
        idVoitureMaj = 0;
        return "ajout";
	}

    //Ajout d'une voiture
    @RequestMapping(value = "/voiture", method = RequestMethod.POST)
	public String ajoutVoiture(@Valid Voiture voiture, BindingResult result) {
        if (result.hasErrors()){
            return "ajout";
        }

        voitureService.addVoiture(voiture);
        return "redirect:/voiture";
	}

    //Suppression d'une voiture
    @RequestMapping(value = "/suppression", method = RequestMethod.GET, params = {"id_voiture"})
         public String suppressionVoiture(@RequestParam(value = "id_voiture") int idVoiture, Model model) {
        voitureService.removeVoiture(idVoiture);
        return "redirect:/voiture";
    }

    //Préparation de la mise à jour d'une voiture
    @RequestMapping(value = "/maj", method = RequestMethod.GET, params = {"id_voiture"})
    public String misAJourVoiture(@RequestParam(value = "id_voiture") int idVoiture, Model model) {
        model.addAttribute("voiture", voitureService.getVoitureById(idVoiture));
        return "maj";
    }

    //Mise à jour de la voiture
    @RequestMapping(value = "/majSauvegarde", method = RequestMethod.POST)
    public String misAJourSauvegardeVoiture(@Valid Voiture voiture, BindingResult result) {
        if (result.hasErrors()){
            return "maj";
        }

        voitureService.updateVoiture(voiture);
        return "redirect:/voiture";
    }

    /**********
     * Option *
     **********/

    //Préparation de l'ajout d'une option
    @RequestMapping(value = "/prepareAjoutOption")
    public String prepareAjoutOption(Voiture voiture, Model model) {
       model.addAttribute("options", voiture.getOptions());
       return "ajoutOption";
    }

    //Ajout d'une option
    @RequestMapping(value = "/voiture/ajoutOptionVoiture", method = RequestMethod.POST)
    public String ajoutOptionVoiture(@ModelAttribute("options") String optionVoiture, BindingResult result) {
        Boolean flg_ajout = true;
        System.out.println("optionVoiture=" + optionVoiture);
        if (optionVoiture.equals("")){
            return "redirect:/prepareAjoutOption";
    }

        for (String option : choixOptions){
            if (option.equals(optionVoiture)){
                flg_ajout = false;
            }
        }

        if (flg_ajout){
            choixOptions.add(optionVoiture);
        }

        return "redirect:/prepareSuppressionOption";
    }

    //Préparation de la suppression d'une option
    @RequestMapping(value = "/prepareSuppressionOption")
    public String prepareSuppressionOption(Voiture voiture, Model model) {
        model.addAttribute("options", voiture.getOptions());
        return "suppressionOption";
    }

    //Suppression d'une option
    @RequestMapping(value = "/suppressionOption", method = RequestMethod.GET, params = {"id_option"})
    public String suppressionOption(@RequestParam(value = "id_option") String idOption, Model model) {
        for (int i=0; i<choixOptions.size(); i++){
            if (choixOptions.get(i).equals(idOption)){
                choixOptions.remove(i);
            }
        }

        return "redirect:/prepareSuppressionOption";
    }

    //Affichage de la liste des marques
    @RequestMapping("/listeMarqueVoiture")
    public String listeMarques(Model model) {
        model.addAttribute("listeMarques", choixMarques);
        return "listeMarque";
    }

    /***********
     * Données *
     ***********/

    //Marques
    @ModelAttribute("choixMarques")
    public List<String> addMarques() {
        choixMarques.add("PEUGEOT");
        choixMarques.add("CITROEN");
        choixMarques.add("RENAULT");

        return choixMarques;
    }

    //Options
    @ModelAttribute("choixOptions")
	public List<String> addOptions() {
        if (choixOptions.isEmpty()){
            choixOptions.add("Toit panoramique");
            choixOptions.add("GPS Europe");
            choixOptions.add("GPS France");
            choixOptions.add("Radar de parking");
            choixOptions.add("Retroviseurs electriques");
            choixOptions.add("Sieges chauffants");
        }
		return choixOptions;
	}
}
