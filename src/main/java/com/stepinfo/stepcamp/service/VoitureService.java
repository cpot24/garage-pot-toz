package com.stepinfo.stepcamp.service;

import com.stepinfo.stepcamp.model.Voiture;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Service
public class VoitureService {

    private static EntityManager entityManager;

	static {
        // Créer une EntityManagerFactory à partir du nom de notre contexte JPA
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_test");

        // Créer un EntityManager
        entityManager = entityManagerFactory.createEntityManager();
	}
	
	public List<Voiture> getListeVoitures() {
        TypedQuery<Voiture> voitureTypedQuery = entityManager.createNamedQuery("voiture.tous", Voiture.class);
		return voitureTypedQuery.getResultList();
	}
	
	public Voiture getVoitureById(Integer id) {
        TypedQuery<Voiture> voitureTypedQuery = entityManager.createNamedQuery("voiture.id", Voiture.class);
        voitureTypedQuery.setParameter("id", id);
		return voitureTypedQuery.getSingleResult();
	}
	
	public List<Voiture> addVoiture(Voiture voiture) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(voiture);

        entityTransaction.commit();

		return getListeVoitures();
	}
	
	public void updateVoiture(Voiture voiture) {
        // Voiture non trouvée
        if (getVoitureById(voiture.getId()).equals(null)){
            return;
        }

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.merge(voiture);

        entityTransaction.commit();
    }
	
	public void removeVoiture(Integer id) {
        Voiture voiture = getVoitureById(id);
        // Voiture non trouvée
        if (voiture.equals(null)){
            return;
        }

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.remove(voiture);

        entityTransaction.commit();
	}

    public Voiture getNouvelleVoiture(){
        Voiture voiture = new Voiture();
        voiture.setType("terre");
        voiture.setNbPortes(3);
        voiture.setNbRoues(4);
        return voiture;
    }

}
