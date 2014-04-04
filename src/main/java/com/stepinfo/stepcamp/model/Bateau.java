package com.stepinfo.stepcamp.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by cpot on 26/03/2014.
 */
@XmlRootElement(name = "bateau")
public class Bateau extends Vehicule{
    @NotNull
    private Integer nbGilet;

    @NotEmpty
    private String typeBateau;

    public Integer getNbGilet() {
        return nbGilet;
    }
    @XmlElement
    public void setNbGilet(Integer nbGilet) {
        this.nbGilet = nbGilet;
    }

    public String getTypeBateau() {
        return typeBateau;
    }
    @XmlElement
    public void setTypeBateau(String typeBateau) {
        this.typeBateau = typeBateau;
    }
}
