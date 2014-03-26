package com.stepinfo.stepcamp.service;

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

    private static int anInt = 1;

    public static List<Bateau> getListeBateaux() {
        return listeBateaux;
    }

    public static void setListeBateaux(List<Bateau> listeBateaux) {
        BateauService.listeBateaux = listeBateaux;
    }
}
