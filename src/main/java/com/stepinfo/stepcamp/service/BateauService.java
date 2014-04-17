package com.stepinfo.stepcamp.service;

import com.stepinfo.stepcamp.model.Bateau;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

/**
 * Created by cpot on 26/03/2014.
 */
@Service
public class BateauService {

    private static EntityManager entityManager;

    static {
        // Créer une EntityManagerFactory à partir du nom de notre contexte JPA
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_test");

        // Créer un EntityManager
        entityManager = entityManagerFactory.createEntityManager();
    }

    public static List<Bateau> getListeBateaux() {
        TypedQuery<Bateau> bateauTypedQuery = entityManager.createNamedQuery("bateau.tous", Bateau.class);
        return bateauTypedQuery.getResultList();
    }

    public Bateau getBateauById(Integer id) {
        TypedQuery<Bateau> bateauTypedQuery = entityManager.createNamedQuery("bateau.id", Bateau.class);
        bateauTypedQuery.setParameter("id", id);
        return bateauTypedQuery.getSingleResult();
    }

    public List<Bateau> addBateau(Bateau bateau) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(bateau);

        entityTransaction.commit();

        return getListeBateaux();
    }

    public void updateBateau(Bateau bateau) {
        // Bateau non trouvé
        if (getBateauById(bateau.getId()).equals(null)){
            return;
        }

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.merge(bateau);

        entityTransaction.commit();
    }

    public void removeBateau(Integer id) {
        Bateau bateau = getBateauById(id);
        // Bateau non trouvé
        if (bateau.equals(null)){
            return;
        }

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.remove(bateau);

        entityTransaction.commit();
    }

    public Bateau getNouveauBateau(){
        Bateau bateau = new Bateau();
        bateau.setType("terre");
        bateau.setNbGilet(4);
        bateau.setTypeBateau("Vedette");
        return bateau;
    }
}
