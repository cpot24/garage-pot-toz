package com.stepinfo.stepcamp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stepinfo.stepcamp.model.Voiture;

@Service
public class VoitureService {

	private static List<Voiture> listeVoiture = new ArrayList<Voiture>();

	private static int i=1;
	
	static {
		preparerLesVoitures();
	}
	
	public List<Voiture> getListeVoitures() {
		return listeVoiture;
	}
	
	public Voiture getVoitureById(Integer id) {
		for (Voiture voiture : listeVoiture) {
			if (voiture.getId() == id) {
				return voiture;
			}
		}
		return null;
	}
	
	public List<Voiture> addVoiture(Voiture voiture) {
		voiture.setId(i++);
		listeVoiture.add(voiture);
		return listeVoiture;
	}
	
	public void updateVoiture(Voiture voiture) {
		for (Voiture voiture_ : listeVoiture) {
            System.out.println(voiture_.getId() + " ? " + voiture.getId());
			if (voiture_.getId() == voiture.getId()) {
				listeVoiture.remove(voiture_);
				listeVoiture.add(voiture);
				return;
			}
		}
	}
	
	public void removeVoiture(Integer id) {
		for (Voiture voiture : listeVoiture) {
			if (voiture.getId() == id) {
				listeVoiture.remove(voiture);
				return;
			}
		}
	}
	
	private static void preparerLesVoitures() {
	}

    public Voiture getNouvelleVoiture(){
        Voiture voiture = new Voiture();
        voiture.setType("terre");
        voiture.setNbPortes(3);
        voiture.setNbRoues(4);
        return voiture;
    }

}
