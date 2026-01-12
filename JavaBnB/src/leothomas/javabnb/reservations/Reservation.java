package leothomas.javabnb.reservations;

import leothomas.javabnb.outils.Utile;
import leothomas.javabnb.utilisateurs.Voyageur;

import java.util.Date;

public class Reservation {
    private Reservable objetReservable;

    private Voyageur voyageur;

    private Date dateDeReservation;

    public Reservation(Reservable objetReservable, Voyageur voyageur) throws Exception {
        // Validation de la date d'arrivée
        if (!objetReservable.aUneDateArriveeCorrecte()) {
            throw new Exception("La date d'arrivée n'est pas correcte. Elle doit être postérieure à la date actuelle.");
        }

        // Validation du nombre de nuits
        if (!objetReservable.aUnNombreDeNuitsCorrect()) {
            throw new Exception("Le nombre de nuits n'est pas correct. Il doit être compris entre 1 et 31 nuits.");
        }

        // Validation du nombre de voyageurs
        if (!objetReservable.aUnNombreDeVoyageursCorrect()) {
            throw new Exception("Le nombre de voyageurs dépasse la capacité d'accueil du logement.");
        }

        // Si toutes les validations sont passées, on initialise l'objet
        this.objetReservable = objetReservable;
        this.voyageur = voyageur;
        this.dateDeReservation = new Date();
    }

    public void afficher(){
        System.out.println("Date de la réservation : " + Utile.formaterDate(dateDeReservation));
        System.out.println("Voyageur : " + voyageur.getPrenom() + " " + voyageur.getNom() + " (" + voyageur.getAge() + " ans)");
        System.out.println("A réservé chez");
        objetReservable.afficher();
    }

}
