package leothomas.javabnb;

import leothomas.javabnb.utilisateurs.Personne;
import leothomas.javabnb.logements.Logement;
import leothomas.javabnb.reservations.Sejour;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        // Création de plusieurs personnes avec des noms de basketteurs NBA
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
    }
}
