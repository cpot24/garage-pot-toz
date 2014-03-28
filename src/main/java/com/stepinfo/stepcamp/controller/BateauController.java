package com.stepinfo.stepcamp.controller;

import com.stepinfo.stepcamp.model.Bateau;
import com.stepinfo.stepcamp.model.Moto;
import com.stepinfo.stepcamp.service.BateauService;
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
public class BateauController {

    @Autowired
    private BateauService bateauService;

    private int idBateauMaj = 0;
    private List<String> choixOptions = new ArrayList<String>();
    private List<String> choixMarques = new ArrayList<String>();

    /***********
     * Bateaux *
     ***********/

    //Affichage de la liste des bateaux
    @RequestMapping("/bateau")
    public String listeBateau(Model model) {
        model.addAttribute("listeBateau", bateauService.getListeBateaux());
		return "listeBateaux";
	}

    //Préparation de l'ajout d'une bateau
    @RequestMapping(value = "/prepareAjoutBateau", method = RequestMethod.GET)
	public String prepareAjoutBateau(Bateau bateau, Model model) {
        model.addAttribute("bateau", bateauService.getNouveauBateau());
        idBateauMaj = 0;
        return "ajoutBateau";
	}

    //Ajout d'une bateau
    @RequestMapping(value = "/bateau", method = RequestMethod.POST)
	public String ajoutBateau(@Valid Bateau bateau, BindingResult result) {
        if (result.hasErrors()){
            return "ajoutBateau";
        }

        bateauService.addBateau(bateau);
        return "redirect:/bateau";
	}

    //Suppression d'un bateau
    @RequestMapping(value = "/suppressionBateau", method = RequestMethod.GET, params = {"id_bateau"})
        public String suppressionBateau(@RequestParam(value = "id_bateau") int idBateau, Model model) {
        bateauService.removeBateau(idBateau);
        return "redirect:/bateau";
    }

    //Préparation de la mise à jour d'un bateau
    @RequestMapping(value = "/majBateau", method = RequestMethod.GET, params = {"id_bateau"})
    public String misAJourBateau(@RequestParam(value = "id_bateau") int idBateau, Model model) {
        model.addAttribute("bateau", bateauService.getBateauById(idBateau));
        return "majBateau";
    }

    //Mise à jour d'un bateau
    @RequestMapping(value = "/majSauvegardeBateau", method = RequestMethod.POST)
    public String misAJourSauvegardeBateau(@Valid Bateau bateau, BindingResult result) {
        if (result.hasErrors()){
            return "majBateau";
        }

        bateauService.updateBateau(bateau);
        return "redirect:/bateau";
    }

    /**********
     * Option *
     **********/

    //Préparation de l'ajout d'une option
    @RequestMapping(value = "/prepareAjoutOptionBateau")
    public String prepareAjoutOptionBateau(Bateau bateau, Model model) {
       model.addAttribute("options", bateau.getOptions());
       return "ajoutOptionBateau";
    }

    //Ajout d'une option
    @RequestMapping(value = "/bateau/ajoutOptionbateau", method = RequestMethod.POST)
    public String ajoutOptionBateau(@ModelAttribute("options") String optionBateau, BindingResult result) {
        Boolean flg_ajout = true;
        if (optionBateau.equals("")){
            return "redirect:/prepareAjoutOptionBateau";
    }

        for (String option : choixOptions){
            if (option.equals(optionBateau)){
                flg_ajout = false;
            }
        }

        if (flg_ajout){
            choixOptions.add(optionBateau);
        }

        return "redirect:/prepareSuppressionOptionBateau";
    }

    //Préparation de la suppression d'une option
    @RequestMapping(value = "/prepareSuppressionOptionBateau")
    public String prepareSuppressionOptionBateau(Bateau bateau, Model model) {
        model.addAttribute("options", bateau.getOptions());
        return "suppressionOptionBateau";
    }

    //Suppression d'une option
    @RequestMapping(value = "/suppressionOptionBateau", method = RequestMethod.GET, params = {"id_option"})
    public String suppressionOptionBateau(@RequestParam(value = "id_option") String idOption, Model model) {
        for (int i=0; i<choixOptions.size(); i++){
            if (choixOptions.get(i).equals(idOption)){
                choixOptions.remove(i);
            }
        }

        return "redirect:/prepareSuppressionOptionBateau";
    }

    //Affichage de la liste des marques
    @RequestMapping("/listeMarqueBateau")
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
        choixMarques.add("GUICUACH");
        choixMarques.add("ZODIAK");
        choixMarques.add("BENETTO");
        return choixMarques;
    }

    //Options
    @ModelAttribute("choixOptions")
	public List<String> addOptions() {
        if (choixOptions.isEmpty()){
            choixOptions.add("Jet ski");
            choixOptions.add("Bouee banane");
            choixOptions.add("Casquette de capitaine");
        }
		return choixOptions;
	}
}
