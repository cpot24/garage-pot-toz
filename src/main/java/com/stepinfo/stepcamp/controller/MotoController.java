package com.stepinfo.stepcamp.controller;

import com.stepinfo.stepcamp.model.Moto;
import com.stepinfo.stepcamp.service.MotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;


@Controller
public class MotoController {

    @Autowired
    private MotoService motoService;

    private int idMotoMaj = 0;
    private List<String> choixOptions = new ArrayList<String>();
    private List<String> choixMarques = new ArrayList<String>();

    /***********
     * Moto *
     ***********/

    //Affichage de la liste des motos
    @RequestMapping("/moto")
    public String listeVoiture(Model model) {
        model.addAttribute("listeMoto", motoService.getListeMotos());
		return "listeMoto";
	}

    //Préparation de l'ajout d'une moto
    @RequestMapping(value = "/responsablePrepareAjoutMoto", method = RequestMethod.GET)
	public String prepareAjoutMoto(Moto moto, Model model) {
        model.addAttribute("moto", motoService.getNouvelleMoto());
        idMotoMaj = 0;
        return "ajoutMoto";
	}

    //Ajout d'une moto
    @RequestMapping(value = "/moto", method = RequestMethod.POST)
	public String ajoutMoto(@Valid Moto moto, BindingResult result) {
        if (result.hasErrors()){
            return "ajoutMoto";
        }

        motoService.addMoto(moto);
        return "redirect:/moto";
	}

    //Suppression d'une moto
    @RequestMapping(value = "/responsableSuppressionMoto", method = RequestMethod.GET, params = {"id_moto"})
        public String suppressionMoto(@RequestParam(value = "id_moto") int idMoto, Model model) {
        motoService.removeMoto(idMoto);
        return "redirect:/moto";
    }

    //Préparation de la mise à jour d'une moto
    @RequestMapping(value = "/collaborateurMajMoto", method = RequestMethod.GET, params = {"id_moto"})
    public String misAJourMoto(@RequestParam(value = "id_moto") int idMoto, Model model) {
        model.addAttribute("moto", motoService.getMotoById(idMoto));
        return "majMoto";
    }

    //Mise à jour de la moto
    @RequestMapping(value = "/majSauvegardeMoto", method = RequestMethod.POST)
    public String misAJourSauvegardeMoto(@Valid Moto moto, BindingResult result) {
        if (result.hasErrors()){
            return "majMoto";
        }

        motoService.updateMoto(moto);
        return "redirect:/moto";
    }

    /**********
     * Option *
     **********/

    //Préparation de l'ajout d'une option
    @RequestMapping(value = "/adminPrepareAjoutOptionMoto")
    public String prepareAjoutOptionMoto(Moto moto, Model model) {
       model.addAttribute("options", moto.getOptions());
       return "ajoutOptionMoto";
    }

    //Ajout d'une option
    @RequestMapping(value = "/moto/ajoutOptionMoto", method = RequestMethod.POST)
    public String ajoutOptionMoto(@ModelAttribute("options") String optionMoto, BindingResult result) {
        Boolean flg_ajout = true;
        if (optionMoto.equals("")){
            return "redirect:/prepareAjoutOptionMoto";
    }

        for (String option : choixOptions){
            if (option.equals(optionMoto)){
                flg_ajout = false;
            }
        }

        if (flg_ajout){
            choixOptions.add(optionMoto);
        }

        return "redirect:/prepareSuppressionOptionMoto";
    }

    //Préparation de la suppression d'une option
    @RequestMapping(value = "/prepareSuppressionOptionMoto")
    public String prepareSuppressionOptionMoto(Moto moto, Model model) {
        model.addAttribute("options", moto.getOptions());
        return "suppressionOptionMoto";
    }

    //Suppression d'une option
    @RequestMapping(value = "/adminSuppressionOptionMoto", method = RequestMethod.GET, params = {"id_option"})
    public String suppressionOptionMoto(@RequestParam(value = "id_option") String idOption, Model model) {
        for (int i=0; i<choixOptions.size(); i++){
            if (choixOptions.get(i).equals(idOption)){
                choixOptions.remove(i);
            }
        }

        return "redirect:/prepareSuppressionOptionMoto";
    }

    //Affichage de la liste des marques
    @RequestMapping("/listeMarqueMoto")
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
        choixMarques.add("DUCATI");
        choixMarques.add("SUZUKI");
        choixMarques.add("YAMAHA");
        choixMarques.add("HONDA");
        choixMarques.add("KTM");

        return choixMarques;
    }

    //Options
    @ModelAttribute("choixOptions")
	public List<String> addOptions() {
        if (choixOptions.isEmpty()){
            choixOptions.add("Roulettes a l'arriere");
            choixOptions.add("Poignees chauffantes");
            choixOptions.add("Selle de confort");
        }
		return choixOptions;
	}
}
