package leothomas.javabnb.reservations;

import leothomas.javabnb.outils.Utile;
import leothomas.javabnb.utilisateurs.Voyageur;

import java.util.Date;

public class Reservation {
    private Reservable objetReservable;

    private Voyageur voyageur;

    private Date dateDeReservation;

    public Reservation(Reservable objetReservable, Voyageur voyageur) {
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
