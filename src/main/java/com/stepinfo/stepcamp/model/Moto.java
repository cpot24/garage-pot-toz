package com.stepinfo.stepcamp.model;

import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@NamedQueries({
        @NamedQuery(name = "moto.tous", query = "from Moto"),
        @NamedQuery(name = "moto.id", query = "from Moto where id = :id"),
})
@XmlRootElement(name = "moto")
public class Moto extends Vehicule {

    public Moto() {
    }

    private Boolean carenage;

    @NotNull
    private String typeModele;

    public Boolean getCarenage() {
        return carenage;
    }

    public void setCarenage(Boolean carenage) {
        this.carenage = carenage;
    }

    public String getTypeModele() {
        return typeModele;
    }

    public void setTypeModele(String typeModele) {
        this.typeModele = typeModele;
    }
}
