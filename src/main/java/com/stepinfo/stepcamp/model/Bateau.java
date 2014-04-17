package com.stepinfo.stepcamp.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({
        @NamedQuery(name = "bateau.tous", query = "from Bateau"),
        @NamedQuery(name = "bateau.id", query = "from Bateau where id = :id"),
})
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
