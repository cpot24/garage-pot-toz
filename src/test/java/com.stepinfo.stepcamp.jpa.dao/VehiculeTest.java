import com.stepinfo.stepcamp.model.Bateau;
import com.stepinfo.stepcamp.model.Moto;
import com.stepinfo.stepcamp.model.Voiture;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.persistence.*;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VehiculeTest {

    private static EntityManager entityManager;
    private Voiture voiture1, voiture2, voiture3;
    private Moto moto1, moto2, moto3;
    private Bateau bateau1;

    @BeforeClass
    public static void setupEntityManager() {
        // Créer une EntityManagerFactory à partir du nom de notre contexte JPA
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_test");

        // Créer un EntityManager
        entityManager = entityManagerFactory.createEntityManager();
    }

    @Test
    public void testInsertionEtLectureDeVehicule(){
        creerVehicules();

        // Vérification des voitures
        TypedQuery<Voiture> voitureTypedQuery = entityManager.createQuery("from Voiture", Voiture.class);
        List<Voiture> voitures = voitureTypedQuery.getResultList();

        TypedQuery<Voiture> voitureTypedQuery2 = entityManager.createNamedQuery("voiture.tous", Voiture.class);
        List<Voiture> voitures2 = voitureTypedQuery2.getResultList();

        assertNotNull(voitures);
        assertNotNull(voitures2);
        assertEquals(voitures, voitures2);
        assertEquals(voitures.size(), 3);

        // Vérification des motos
        TypedQuery<Moto> motoTypedQuery = entityManager.createQuery("from Moto", Moto.class);
        List<Moto> motos = motoTypedQuery.getResultList();

        TypedQuery<Moto> motoTypedQuery2 = entityManager.createNamedQuery("moto.tous", Moto.class);
        List<Moto> motos2 = motoTypedQuery2.getResultList();

        assertNotNull(motos);
        assertNotNull(motos2);
        assertEquals(motos, motos2);
        assertEquals(motos.size(), 3);

        // Vérification des bateaux
        TypedQuery<Bateau> bateauTypedQuery = entityManager.createQuery("from Bateau", Bateau.class);
        List<Bateau> bateaux = bateauTypedQuery.getResultList();

        TypedQuery<Bateau> bateauTypedQuery2 = entityManager.createNamedQuery("bateau.tous", Bateau.class);
        List<Bateau> bateaux2 = bateauTypedQuery2.getResultList();

        assertNotNull(bateaux);
        assertNotNull(bateaux2);
        assertEquals(bateaux, bateaux);
        assertEquals(bateaux.size(), 1);

        // Supprimer tous les véhicules créés
      //  supprimerVehicules();
    }

    private void creerVehicules(){
        // Créer 3 voitures
        voiture1 = new Voiture();
        voiture1.setMarque("PEUGEOT");
        voiture1.setModele("307");
        voiture1.setCouleur("rouge");
        voiture1.setNbRoues(4);
        voiture1.setNbPortes(5);
        voiture1.setNbPlaces(5);
        voiture1.setNeuf(false);
        voiture1.setPuissance(90);
        voiture1.setType("terre");

        voiture2 = new Voiture();
        voiture2.setMarque("CITROEN");
        voiture2.setModele("C4 Picasso Exclusive");
        voiture2.setCouleur("noir");
        voiture2.setNbRoues(4);
        voiture2.setNbPortes(5);
        voiture2.setNbPlaces(5);
        voiture2.setNeuf(false);
        voiture2.setPuissance(138);
        voiture2.setType("terre");

        voiture3 = new Voiture();
        voiture3.setMarque("RENAULT");
        voiture3.setModele("Super 5");
        voiture3.setCouleur("beige");
        voiture3.setNbRoues(4);
        voiture3.setNbPortes(5);
        voiture3.setNbPlaces(4);
        voiture3.setNeuf(false);
        voiture3.setPuissance(50);
        voiture3.setType("terre");

        // Créer 3 motos
        moto1 = new Moto();
        moto1.setMarque("YAMAHA");
        moto1.setModele("YZF R-125");
        moto1.setCouleur("bleue");
        moto1.setNbPlaces(2);
        moto1.setNeuf(false);
        moto1.setPuissance(125);
        moto1.setType("terre");
        moto1.setCarenage(true);
        moto1.setTypeModele("sportive");

        moto2 = new Moto();
        moto2.setMarque("DUCATI");
        moto2.setModele("Streetfighter");
        moto2.setCouleur("blanche");
        moto2.setNbPlaces(2);
        moto2.setNeuf(true);
        moto2.setPuissance(1300);
        moto2.setType("terre");
        moto2.setCarenage(false);
        moto2.setTypeModele("roadster");

        moto3 = new Moto();
        moto3.setMarque("HONDA");
        moto3.setModele("Pan European");
        moto3.setCouleur("grise");
        moto3.setNbPlaces(2);
        moto3.setNeuf(true);
        moto3.setPuissance(1200);
        moto3.setType("terre");
        moto3.setCarenage(true);
        moto3.setTypeModele("routière");

        //Créer un bateau
        bateau1 = new Bateau();
        bateau1.setMarque("BENETTEAU");
        bateau1.setModele("Denis 3000");
        bateau1.setCouleur("vert");
        bateau1.setNbPlaces(12);
        bateau1.setNeuf(false);
        bateau1.setPuissance(500);
        bateau1.setType("mer");
        bateau1.setNbGilet(12);
        bateau1.setTypeBateau("yacht");

        // Sauvegarder les véhicules
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.persist(voiture1);
        entityManager.persist(voiture2);
        entityManager.persist(voiture3);
        entityManager.persist(moto1);
        entityManager.persist(moto2);
        entityManager.persist(moto3);
        entityManager.persist(bateau1);

        entityTransaction.commit();
    }

    private void supprimerVehicules(){
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();

        entityManager.remove(voiture1);
        entityManager.remove(voiture2);
        entityManager.remove(voiture3);
        entityManager.remove(moto1);
        entityManager.remove(moto2);
        entityManager.remove(moto3);
        entityManager.remove(bateau1);

        entityTransaction.commit();
    }
}