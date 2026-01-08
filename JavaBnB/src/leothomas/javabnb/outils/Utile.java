package leothomas.javabnb.outils;

import java.util.Calendar;
import java.util.Date;

public class Utile {

	//Constructeur privé pour empêcher l'instantiation de cette classe.

	private Utile() {
	}

    // Construit une date à partir de trois entiers (jour, mois, année)
    // mois-1 car la méthode Calendar fais mois-1 comparer au calendrier classique
	public static Date creerDate(int jour, int mois, int annee) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(annee, mois - 1, jour, 0, 0, 0);
		return calendar.getTime();
	}

	//Formate une date au format (JJ/MM/YYYY)
	public static String formaterDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int jour = calendar.get(Calendar.DAY_OF_MONTH);
		int mois = calendar.get(Calendar.MONTH) + 1;
		int annee = calendar.get(Calendar.YEAR);
		return String.format("%02d/%02d/%04d", jour, mois, annee);
	}
}


