package com.stepinfo.stepcamp.model;

import java.util.List;

/**
 * Created by cpot on 27/03/2014.
 */
public class Marque {
    private  Integer id;
    private  String libelle;
    private List<Modele> listeModeles ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public List<Modele> getListeModeles() {
        return listeModeles;
    }

    public void setListeModeles(List<Modele> listeModeles) {
        this.listeModeles = listeModeles;
    }
}
