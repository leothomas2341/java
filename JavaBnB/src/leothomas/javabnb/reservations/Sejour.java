package leothomas.javabnb.reservations;

import java.util.Date;
import leothomas.javabnb.logements.Logement;

	public class Sejour implements Reservable {
	private Date dateArrivee;
	private int nbNuits;
	private Logement logement;
	private int nbVoyageurs;

	public Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		this.dateArrivee = dateArrivee;
		this.nbNuits = nbNuits;
		this.logement = logement;
		this.nbVoyageurs = nbVoyageurs;
	}

	public void afficher() {
		logement.afficher();
		System.out.println("La date d'arrivée est le " + String.format("%02d/%02d/%04d",
			dateArrivee.getDate(), dateArrivee.getMonth() + 1, dateArrivee.getYear() + 1900) +
			" pour " + nbNuits + " nuits.");
		System.out.println("Le prix de ce séjour est de " + (logement.getTarifParNuit() * nbNuits) + "€.");
	}

	@Override
	public boolean aUneDateArriveeCorrecte() {
		return dateArrivee != null && dateArrivee.after(new Date());
	}

	@Override
	public boolean aUnNombreDeNuitsCorrect() {
		return nbNuits >= 1 && nbNuits <= 31;
	}

	@Override
	public boolean aUnNombreDeVoyageursCorrect() {
		return nbVoyageurs > 0 && nbVoyageurs <= logement.getNbVoyageursMax();
	}
}
