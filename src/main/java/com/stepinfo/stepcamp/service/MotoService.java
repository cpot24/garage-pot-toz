package com.stepinfo.stepcamp.service;

import com.stepinfo.stepcamp.model.Moto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cpot on 26/03/2014.
 */
@Service
public class MotoService {

    private static List<Moto> listeMotos = new ArrayList<Moto>();

    private static int i=1;

    public static List<Moto> getListeMotos() {
        return listeMotos;
    }

    public Moto getMotoById(Integer id) {
        for (Moto moto : listeMotos) {
            if (moto.getId() == id) {
                return moto;
            }
        }
        return null;
    }

    public static void setListeMotos(List<Moto> listeMoto) {
        MotoService.listeMotos = listeMoto;
    }

    public List<Moto> addMoto(Moto moto) {
        moto.setId(i++);
        listeMotos.add(moto);
        return listeMotos;
    }

    public void updateMoto(Moto moto) {
        for (Moto moto_ : listeMotos) {
            System.out.println(moto_.getId() + " ? " + moto.getId());
            if (moto_.getId() == moto.getId()) {
                listeMotos.remove(moto_);
                listeMotos.add(moto);
                return;
            }
        }
    }

    public void removeMoto(Integer id) {
        for (Moto moto : listeMotos) {
            if (moto.getId() == id) {
                listeMotos.remove(moto);
                return;
            }
        }
    }


    public Moto getNouvelleMoto(){
        Moto voiture = new Moto();
        voiture.setType("terre");
        voiture.setCarenage(false);
        voiture.setTypeModele("Roadster");
        return voiture;
    }
}
