package com.stepinfo.stepcamp.model;

import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by cpot on 26/03/2014.
 */
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
