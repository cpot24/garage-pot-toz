package pages

import javax.swing.text.AbstractDocument.Content

/**
 * Created by cpot on 04/04/2014.
 */
class HomePage {
    static url = "/home.jsp"

    static at = {
        a == 'Voiture'
        a == 'Moto'
        a == 'Bateau'
    }

    static content = {
        lienListeVoiture (to: listeVoiturePage) { $('#listeVoiture')}
        boutonCreerVoiture (to:  CreationVoiturePage) { $('#creerVoiture')}
    }
}
