package com.stepinfo.stepcamp.service;

import com.stepinfo.stepcamp.model.Moto;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

/**
 * Created by cpot on 26/03/2014.
 */
@Service
public class MotoService {

    private static EntityManager entityManager;

    static {
        // Créer une EntityManagerFactory à partir du nom de notre contexte JPA
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_test");

        // Créer un EntityManager
        entityManager = entityManagerFactory.createEntityManager();
    }

    public static List<Moto> getListeMotos() {
        TypedQuery<Moto> motoTypedQuery = entityManager.createNamedQuery("moto.tous", Moto.class);
        return motoTypedQuery.getResultList();
    }

    public Moto getMotoById(Integer id) {
        TypedQuery<Moto> motoTypedQuery = entityManager.createNamedQuery("moto.id", Moto.class);
        motoTypedQuery.setParameter("id", id);
        return motoTypedQuery.getSingleResult();
    }

    public List<Moto> addMoto(Moto moto) {
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(moto);

        entityTransaction.commit();

        return getListeMotos();
    }

    public void updateMoto(Moto moto) {
        // Moto non trouvée
        if (getMotoById(moto.getId()).equals(null)){
            return;
        }

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.merge(moto);

        entityTransaction.commit();
    }

    public void removeMoto(Integer id) {
        Moto moto = getMotoById(id);
        // Moto non trouvée
        if (moto.equals(null)){
            return;
        }

        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.remove(moto);

        entityTransaction.commit();
    }

    public Moto getNouvelleMoto(){
        Moto voiture = new Moto();
        voiture.setType("terre");
        voiture.setCarenage(false);
        voiture.setTypeModele("Roadster");
        return voiture;
    }
}
