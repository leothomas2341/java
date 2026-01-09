package leothomas.javabnb.logements;

import leothomas.javabnb.utilisateurs.Personne;

public class Appartement extends Logement {
	private String etage;
	private boolean balcon;
	private int superficieBalcon;

	public Appartement(Personne hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax,
			String etage, boolean balcon, int superficieBalcon) {
		super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
		this.etage = etage;
		this.balcon = balcon;
		this.superficieBalcon = superficieBalcon;
	}

	@Override
	public void afficher() {
		getHote().afficher();
		System.out.println("Le logement est un appartement situé " + getAdresse() + " au " + etage + ".");
		System.out.println("Superficie : " + getSuperficie() + "m2");
		if (balcon) {
			System.out.println("Balcon : Oui (" + superficieBalcon + "m2)");
		} else {
			System.out.println("Balcon : Non");
		}
	}
}

