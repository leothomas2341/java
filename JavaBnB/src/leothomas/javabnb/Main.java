package leothomas.javabnb;

import leothomas.javabnb.reservations.*;
import leothomas.javabnb.utilisateurs.Personne;
import leothomas.javabnb.utilisateurs.Hote;
import leothomas.javabnb.utilisateurs.Voyageur;
import leothomas.javabnb.logements.Logement;
import leothomas.javabnb.logements.Maison;
import leothomas.javabnb.logements.Appartement;
import leothomas.javabnb.outils.Utile;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        Hote hote1 = new Hote("Peter", "Bardu", 31, 1);
        Hote hote2 = new Hote("Maxime", "Albert", 29, 12);

        Voyageur voyageur = new Voyageur("Sylvie", "Castillo", 74);

        Maison maison = new Maison(hote1, 50, "18 rue Colbert, 37000 Tours", 140, 5, 1000, true);
        Appartement appartement = new Appartement(hote2, 80, "22 rue Colbert, 37000 Tours", 80, 2, "3ème étage", true, 10);

        System.out.println("TEST 1 : Réservation valide");
        Date dateArrivee1 = Utile.creerDate(15, 7, 2026);
        int nbNuits1 = 7;
        int nbVoyageurs1 = 3;
        Sejour sejour1 = SejourFactory.createSejour(dateArrivee1, nbNuits1, maison, nbVoyageurs1);

        try {
            Reservation reservation1 = new Reservation(sejour1, voyageur);
            reservation1.afficher();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println();

        System.out.println("TEST 2 : Date d'arrivée dans le passé (1972)");
        Date dateArrivee2 = Utile.creerDate(15, 7, 1972);
        int nbNuits2 = 5;
        int nbVoyageurs2 = 2;
        Sejour sejour2 = SejourFactory.createSejour(dateArrivee2, nbNuits2, maison, nbVoyageurs2);

        try {
            Reservation reservation2 = new Reservation(sejour2, voyageur);
            reservation2.afficher();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println();

        System.out.println("TEST 3 : Nombre de nuits incorrect (-42)");
        Date dateArrivee3 = Utile.creerDate(15, 8, 2026);
        int nbNuits3 = -42;
        int nbVoyageurs3 = 2;
        Sejour sejour3 = SejourFactory.createSejour(dateArrivee3, nbNuits3, maison, nbVoyageurs3);

        try {
            Reservation reservation3 = new Reservation(sejour3, voyageur);
            reservation3.afficher();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println();

        System.out.println("TEST 4 : Trop de voyageurs (32 dans un petit appartement)");
        Date dateArrivee4 = Utile.creerDate(20, 9, 2026);
        int nbNuits4 = 5;
        int nbVoyageurs4 = 32;
        Sejour sejour4 = SejourFactory.createSejour(dateArrivee4, nbNuits4, appartement, nbVoyageurs4);

        try {
            Reservation reservation4 = new Reservation(sejour4, voyageur);
            reservation4.afficher();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
        System.out.println();

        System.out.println("TEST 5 : Nombre de nuits trop élevé (40 nuits)");
        Date dateArrivee5 = Utile.creerDate(1, 10, 2026);
        int nbNuits5 = 40;
        int nbVoyageurs5 = 2;
        Sejour sejour5 = SejourFactory.createSejour(dateArrivee5, nbNuits5, maison, nbVoyageurs5);

        try {
            Reservation reservation5 = new Reservation(sejour5, voyageur);
            reservation5.afficher();
        } catch (Exception e) {
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
