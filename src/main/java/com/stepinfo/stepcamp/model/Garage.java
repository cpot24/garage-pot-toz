package com.stepinfo.stepcamp.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "garage")
public class Garage {

	public Garage() {
        nom = "Garage Pot & Toz";
        adresse1 = "1 avenue Gay Lussac";
        adresse2 ="33370 Artigues-près-Bordeaux";
        telephone = "0505050505";
	}

	private String nom;
	private String adresse1;
	private String adresse2;
	private String telephone;
	private List<Voiture> listeVoitures = new ArrayList<Voiture>();
//	private List<Voiture> listeVoitures;
//	private List<Voiture> listeVoitures;
//	private List<Voiture> listeVoitures;

	public String getNom() {
		return nom;
	}
	@XmlElement
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse1() {
		return adresse1;
	}
	@XmlElement
	public void setAdresse1(String adresse1) {
		this.adresse1 = adresse1;
	}

    public String getAdresse2() {
        return adresse2;
    }

    public void setAdresse2(String adresse2) {
        this.adresse2 = adresse2;
    }

    public String getTelephone() {
		return telephone;
	}
	@XmlElement
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public List<Voiture> getListeVoitures() {
		return listeVoitures;
	}
	@XmlElement
	public void setListeVoitures(List<Voiture> listeVoitures) {
		this.listeVoitures = listeVoitures;
	}
	
	

}
