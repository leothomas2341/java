package leothomas.javabnb.logements;

import leothomas.javabnb.utilisateurs.Personne;

public abstract class Logement {
	private Personne hote;
	private int tarifParNuit;
	private String adresse;
	private int superficie;
	private int nbVoyageursMax;

	public Logement(Personne hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
		this.hote = hote;
		this.tarifParNuit = tarifParNuit;
		this.adresse = adresse;
		this.superficie = superficie;
		this.nbVoyageursMax = nbVoyageursMax;
	}

	public int getTarifParNuit() {
		return tarifParNuit;
	}

	public String getAdresse() {
		return adresse;
	}

	public int getSuperficie() {
		return superficie;
	}

	public Personne getHote() {
		return hote;
	}

	public int getNbVoyageursMax() {
		return nbVoyageursMax;
	}

	public abstract void afficher();
}
