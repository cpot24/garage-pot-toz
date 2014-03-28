package com.stepinfo.stepcamp.service;

import com.stepinfo.stepcamp.model.Bateau;
import com.stepinfo.stepcamp.model.Bateau;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cpot on 26/03/2014.
 */
@Service
public class BateauService {

    private static List<Bateau> listeBateaux = new ArrayList<Bateau>();

    private static int i=1;

    public static List<Bateau> getListeBateaux() {
        return listeBateaux;
    }

    public Bateau getBateauById(Integer id) {
        for (Bateau bateau : listeBateaux) {
            if (bateau.getId() == id) {
                return bateau;
            }
        }
        return null;
    }

    public static void setListeBateaux(List<Bateau> listeBateau) {
        BateauService.listeBateaux = listeBateau;
    }

    public List<Bateau> addBateau(Bateau bateau) {
        bateau.setId(i++);
        listeBateaux.add(bateau);
        return listeBateaux;
    }

    public void updateBateau(Bateau bateau) {
        for (Bateau bateau_ : listeBateaux) {
            System.out.println(bateau_.getId() + " ? " + bateau.getId());
            if (bateau_.getId() == bateau.getId()) {
                listeBateaux.remove(bateau_);
                listeBateaux.add(bateau);
                return;
            }
        }
    }

    public void removeBateau(Integer id) {
        for (Bateau bateau : listeBateaux) {
            if (bateau.getId() == id) {
                listeBateaux.remove(bateau);
                return;
            }
        }
    }


    public Bateau getNouveauBateau(){
        Bateau bateau = new Bateau();
        bateau.setType("terre");
        bateau.setNbGilet(4);
        bateau.setTypeBateau("Vedette");
        return bateau;
    }
}
