package leothomas.javabnb.reservations;

import java.util.Date;
import leothomas.javabnb.logements.Logement;
import leothomas.javabnb.outils.Utile;

public class SejourLong extends Sejour {

	private int prix;
	private int promotion;
	private static int PROMOTION_EN_POURCENTAGE = 20;

	public SejourLong(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		super(dateArrivee, nbNuits, logement, nbVoyageurs);

		int prixInitial = nbNuits * logement.getTarifParNuit();

		promotion = prixInitial * PROMOTION_EN_POURCENTAGE / 100;

		prix = prixInitial - promotion;
	}

	@Override
	public void miseAJourDuPrixDuSejour() {
		int tarifInitial = getNbNuits() * getLogement().getTarifParNuit();
		promotion = tarifInitial * PROMOTION_EN_POURCENTAGE / 100;
		prix = tarifInitial - promotion;
	}

	@Override
	public void afficher(){
		super.afficher();
		System.out.println("Le prix de ce séjour long est " + prix + "La promotion est de " + promotion + "€");

	}
}

