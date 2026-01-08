package leothomas.javabnb;

import leothomas.javabnb.utilisateurs.Personne;
import leothomas.javabnb.logements.Logement;
import leothomas.javabnb.reservations.Sejour;
import leothomas.javabnb.outils.Utile;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        // Création de plusieurs personnes
        Personne personne1 = new Personne("LeBron", "James", 39);
        Personne personne2 = new Personne("Michael", "Jordan", 61);
        Personne personne3 = new Personne("Kobe", "Bryant", 45);
        Personne personne4 = new Personne("Luka", "Doncic", 25);
        Personne personne5 = new Personne("Kevin", "Durant", 35);

        // Affichage de toutes les personnes
        personne1.afficher();
        personne2.afficher();
        personne3.afficher();
        personne4.afficher();
        personne5.afficher();

        System.out.println("Test Logements");

        // Création de logements avec les personnes
        Logement logement1 = new Logement(personne1, 150, "81 Rue Colbert, 37000 Tours", 140, 4);
        Logement logement2 = new Logement(personne2, 200, "42 Avenue des Champs, 75008 Paris", 120, 3);

        // Affichage des logements
        logement1.afficher();
        System.out.println();
        logement2.afficher();

        System.out.println("Test Sejour");

        // Création d'un logement avec un tarif de 40€ pour le test du séjour
        Logement logementSejour = new Logement(new Personne("Peter", "Bardu", 28), 40, "81 Rue Colbert, 37000 Tours", 140, 4);

        // Création d'un séjour
        // Il est précisé l'année de la date (124) car la convention de la classe Date commence à 19000
        Date dateArrivee = new Date(124, 6, 5); // Année 2024 (124+1900), mois 7 (0-indexed donc 6+1=7), jour 5
        Sejour sejour1 = new Sejour(dateArrivee, 4, logementSejour, 2);

        // Affichage du séjour
        sejour1.afficher();

        System.out.println("Test Classe Utile");

        // Test de creerDate
        System.out.println("Test méthode crierDate()");
        Date date1 = Utile.creerDate(5, 7, 2024);
        System.out.println("Date créée (5 juillet 2024) : " + date1);

        Date date2 = Utile.creerDate(25, 12, 2023);
        System.out.println("Date créée (25 décembre 2023) : " + date2);

        Date date3 = Utile.creerDate(1, 1, 2025);
        System.out.println("Date créée (1er janvier 2025) : " + date3);

        // Test de formaterDate
        System.out.println("Test méthode formaterDate()");
        String dateFormatee1 = Utile.formaterDate(date1);
        System.out.println("Date formatée : " + dateFormatee1 + " (attendu : 05/07/2024)");

        String dateFormatee2 = Utile.formaterDate(date2);
        System.out.println("Date formatée : " + dateFormatee2 + " (attendu : 25/12/2023)");

        String dateFormatee3 = Utile.formaterDate(date3);
        System.out.println("Date formatée : " + dateFormatee3 + " (attendu : 01/01/2025)");
    }
}
