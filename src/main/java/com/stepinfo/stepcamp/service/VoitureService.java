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
	
	private static List<Voiture> preparerLesVoitures() {
        /*System.out.println("listeVoiture.size()="+listeVoiture.size());
        if (listeVoiture.size() == 0){
            Voiture voiture1 = new Voiture();
            voiture1.setId(i++);
            voiture1.setMarque(new Marque());
            voiture1.setCouleur("Noir");
            voiture1.setPuissance(550);
            listeVoiture.add(voiture1);

            Voiture voiture2 = new Voiture();
            voiture2.setId(i++);
            voiture2.setMarque(MARQUE_BMW);
            voiture2.setCouleur("Bleu");
            voiture2.setPuissance(150);
            listeVoiture.add(voiture2);

            Voiture voiture3 = new Voiture();
            voiture3.setId(i++);
            voiture3.setMarque(MARQUE_MERCEDES);
            voiture3.setCouleur("Noir");
            voiture3.setPuissance(460);
            listeVoiture.add(voiture3);

            Voiture voiture4 = new Voiture();
            voiture4.setId(i++);
            voiture4.setMarque(MARQUE_PEUGEOT);
            voiture4.setCouleur("Rouge");
            voiture4.setPuissance(90);
            listeVoiture.add(voiture4);

            Voiture voiture5 = new Voiture();
            voiture5.setId(i++);
            voiture5.setMarque(MARQUE_RENAULT);
            voiture5.setCouleur("Vert");
            voiture5.setPuissance(120);
            listeVoiture.add(voiture5);

            Voiture voiture6 = new Voiture();
            voiture6.setId(i++);
            voiture6.setMarque(MARQUE_BMW);
            voiture6.setCouleur("Vert");
            voiture6.setPuissance(140);
            listeVoiture.add(voiture6);
        }*/
		
		return listeVoiture;
	}

    public Voiture getNouvelleVoiture(){
        Voiture voiture = new Voiture();
        voiture.setType("terre");
        voiture.setNbPortes(3);
        voiture.setNbRoues(4);
        return voiture;
    }
}
