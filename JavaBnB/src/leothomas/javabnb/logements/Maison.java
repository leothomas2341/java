package leothomas.javabnb.logements;

import leothomas.javabnb.utilisateurs.Personne;

public class Maison extends Logement {
	private boolean jardin;
	private int superficieJardin;
	private boolean piscine;

	public Maison(Personne hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax,
				  int superficieJardin, boolean piscine) {
		super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
		this.jardin = jardin;
		this.superficieJardin = superficieJardin;
		this.piscine = piscine;
	}

	@Override
	public void afficher() {
		getHote().afficher();
		System.out.println("Le logement est une maison située " + getAdresse() + ".");
		System.out.println("Superficie : " + getSuperficie() + "m2");
		if (jardin) {
			System.out.println("Jardin : Oui (" + superficieJardin + "m2)");
		} else {
			System.out.println("Jardin : Non");
		}
		System.out.println("Piscine : " + (piscine ? "Oui" : "Non"));
	}
}

