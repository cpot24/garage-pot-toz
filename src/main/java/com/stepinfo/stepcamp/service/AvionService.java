package com.stepinfo.stepcamp.service;

import com.stepinfo.stepcamp.model.Avion;
import org.apache.taglibs.standard.lang.jstl.test.StaticFunctionTests;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by cpot on 26/03/2014.
 */
@Service
public class AvionService {

    private static List<Avion> listeAvions = new ArrayList<Avion>();

    private static int anInt = 1;

    public static List<Avion> getListeAvions() {
        return listeAvions;
    }

    public static void setListeAvions(List<Avion> listAvions) {
        AvionService.listeAvions = listAvions;
    }
}
