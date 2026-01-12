package leothomas.javabnb.reservations;

import java.util.Date;
import leothomas.javabnb.logements.Logement;
import leothomas.javabnb.outils.Utile;

public class SejourCourt extends Sejour {

	private int prix;

	public SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		super(dateArrivee, nbNuits, logement, nbVoyageurs);
		prix = nbNuits * logement.getTarifParNuit();
	}

	@Override
	public void miseAJourDuPrixDuSejour() {
		prix = getNbNuits() * getLogement().getTarifParNuit();
	}

	@Override
	public void afficher(){
		super.afficher();
		System.out.println("Le prix est de " + prix);
	}
}

