package leothomas.javabnb.reservations;

import java.util.Date;
import leothomas.javabnb.logements.Logement;
import leothomas.javabnb.outils.Utile;

public abstract class Sejour implements Reservable {
	private Date dateArrivee;
	private int nbNuits;
	private Logement logement;
	private int nbVoyageurs;
	protected int prix;

	public Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
		this.dateArrivee = dateArrivee;
		this.nbNuits = nbNuits;
		this.logement = logement;
		this.nbVoyageurs = nbVoyageurs;
		miseAJourDuPrixDuSejour();
	}

	protected Date getDateArrivee() {
		return dateArrivee;
	}

	protected int getNbNuits() {
		return nbNuits;
	}

	protected Logement getLogement() {
		return logement;
	}

	protected int getNbVoyageurs() {
		return nbVoyageurs;
	}

    public void afficher() {

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

	public abstract void miseAJourDuPrixDuSejour();
}
