package pages

/**
 * Created by cpot on 04/04/2014.
 */
class CreationVoiturePage {
    static url = "/ajout.jsp"

    static at = {
        h1 == "Ajout d'une voiture"
    }

    static content = {
        h1 { $('h1').text() }
    }
}
