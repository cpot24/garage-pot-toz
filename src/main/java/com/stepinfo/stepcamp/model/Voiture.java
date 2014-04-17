package com.stepinfo.stepcamp.model;

import org.hibernate.validator.constraints.Range;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({
        @NamedQuery(name = "voiture.tous", query = "from Voiture"),
        @NamedQuery(name = "voiture.id", query = "from Voiture where id = :id"),
})
@XmlRootElement(name = "voiture")
public class Voiture extends Vehicule {

	public Voiture() {
	}

    @NotNull
    @Range(min = 4, max = 8)
    private Integer nbRoues;

    @NotNull
    @Range(min = 3, max = 5)
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
