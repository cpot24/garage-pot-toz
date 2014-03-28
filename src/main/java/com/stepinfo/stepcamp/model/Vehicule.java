package com.stepinfo.stepcamp.model;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * Created by cpot & vcamus on 25/03/2014.
 */
public class Vehicule {

    private Integer id;

    @NotEmpty
    private String type;

    //@NotEmpty
    //private Marque marque;

    @NotEmpty
    private Marque marque;

    @NotEmpty
    private Modele modele;

    @NotEmpty
    private String couleur;

    @NotNull
    @Range(min = 1, max = 999)
    private Integer puissance;

    private Boolean neuf;

    private List<String> options;

    private Integer nbPlaces;

    public Integer getId() {
        return id;
    }

    @XmlElement
    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @XmlElement
    public void setType(String type) {
        this.type = type;
    }

    public Marque getMarque() {
        return marque;
    }

    @XmlElement
    public void setMarque(Marque marque) {
        this.marque = marque;
    }

    public Modele getModele() {
        return modele;
    }

    @XmlElement
    public void setModele(Modele modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    @XmlElement
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public Integer getPuissance() {
        return puissance;
    }

    @XmlElement
    public void setPuissance(Integer puissance) {
        this.puissance = puissance;
    }

    public Boolean getNeuf() {
        return neuf;
    }

    @XmlElement
    public void setNeuf(Boolean neuf) {
        this.neuf = neuf;
    }

    public List<String> getOptions() {
        return options;
    }

    @XmlElement
    public void setOptions(List<String> options) {
        this.options = options;
    }

    public Integer getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(Integer nbPlaces) {
        this.nbPlaces = nbPlaces;
    }
}
