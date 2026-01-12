package leothomas.javabnb.reservations;

import java.util.Date;

import leothomas.javabnb.logements.Logement;

public class SejourFactory {

    private static final int CRITERE_SEJOUR_COUT_OU_SEJOUR_LONG = 6;

    // Constructeur private pour ne pas l'instancier
    private SejourFactory() {
    }

    // Méthode static pour être appelée depuis le nom de la classe
    public static Sejour createSejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        Sejour sejour;

        if (nbNuits < CRITERE_SEJOUR_COUT_OU_SEJOUR_LONG) {
            sejour = new SejourCourt(dateArrivee, nbNuits, logement, nbVoyageurs);
        } else {
            sejour = new SejourLong(dateArrivee, nbNuits, logement, nbVoyageurs);
        }

        return sejour;
    }

}