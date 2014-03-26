package com.stepinfo.stepcamp.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

@XmlRootElement(name = "voiture")
public class Voiture extends Vehicule {

	public Voiture() {
	}

    @NotNull
    @Range(min = 4)
    private Integer nbRoues;

    @NotNull
    @Range(min = 3)
    private Integer nbPortes;

    public Integer getNbRoues() {
        return nbRoues;
    }

    @XmlElement
    public void setNbRoues(Integer nbRoues) {
        this.nbRoues = nbRoues;
    }

    @XmlElement
    public Integer getNbPortes() {
        return nbPortes;
    }

    public void setNbPortes(Integer nbPortes) {
        this.nbPortes = nbPortes;
    }
}
