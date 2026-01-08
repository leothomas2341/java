package leothomas.javabnb.logements;

import leothomas.javabnb.utilisateurs.Personne;

public class Logement {
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

	public void afficher() {
		hote.afficher();
		System.out.println();
		System.out.println("Cours 2024 " + hote.getNom() + " " + tarifParNuit);
		System.out.println();
		System.out.println("Le logement est situé " + adresse + ".");
		System.out.println("Superficie : " + superficie + "m2");
	}
}
