import geb.spock.GebReportingSpec
import pages.HomePage

/**
 * Created by cpot on 04/04/2014.
 */
public class CreateVoitureSpec extends GebReportingSpec {

    def "afficher la page de création de voiture"(){
        given: "afficher la page d'accueil"
        to HomePage

        when: "aller vers la page de création de voiture"
        boutonCreerVoiture.click()

        then: "redirection vers la page de création de voiture"
        at CreateVoiturePage
    }

    def "valider le formulaire de la création de voiture"(){

    }
}
