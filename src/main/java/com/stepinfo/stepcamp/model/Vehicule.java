package com.stepinfo.stepcamp.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedQueries({
        @NamedQuery(name = "vehicule.tous", query = "from Vehicule"),
        @NamedQuery(name = "vehicule.id", query = "from Vehicule where id = :id"),
        @NamedQuery(name = "vehicule.type", query = "from Vehicule where type = :type"),
        @NamedQuery(name = "vehicule.marque", query = "from Vehicule where marque = :marque"),
        @NamedQuery(name = "vehicule.modele", query = "from Vehicule where modele = :modele"),
})
@XmlRootElement(name = "vehicule")
public abstract class Vehicule {

    @Id
    @Column(name = "vehicule_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column( nullable = false)
    private String type;

    @Column( nullable = false)
    private String marque;

    @Column( nullable = false)
    private String modele;

    @Column( nullable = false)
    private String couleur;

    @Column( nullable = false)
    @Range(min = 1, max = 1999)
    private Integer puissance;

    private Boolean neuf;

    @ElementCollection
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

    public String getMarque() {
        return marque;
    }

    @XmlElement
    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    @XmlElement
    public void setModele(String modele) {
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
