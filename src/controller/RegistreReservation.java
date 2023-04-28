/*
 * Cas d'utilisation : RESERVER VÉHICULE
 * PAR WINNER MAZONZIKA PINDI
 * */

package controller;

import model.Client;
import model.Reservation;
import model.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class RegistreReservation {
    private List<Reservation> reservations;
    public RegistreReservation() {
        reservations = new ArrayList<>();
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void ajouterReservation(Client client, Vehicule vehicule, String dateDebut, String dateFin) {
        Reservation reservation = new Reservation(client, vehicule, dateDebut, dateFin);
        reservations.add(reservation);
    }

    public void supprimerReservation(Reservation reservation) {
        reservations.remove(reservation);
    }

    public List<Reservation> chercherReservations(Client client) {
        List<Reservation> resultats = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getClient().equals(client)) {
                resultats.add(reservation);
            }
        }
        return resultats;
    }

    public List<Reservation> chercherReservations(Vehicule vehicule) {
        List<Reservation> resultats = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getVehicule().equals(vehicule)) {
                resultats.add(reservation);
            }
        }
        return resultats;
    }

    public List<Reservation> chercherReservations(String dateDebut, String dateFin) {
        List<Reservation> resultats = new ArrayList<>();
        for (Reservation reservation : reservations) {
            if (reservation.getDateeReservation().equals(dateDebut) && reservation.getDateFinReservation().equals(dateFin)) {
                resultats.add(reservation);
            }
        }
        return resultats;
    }

    public Reservation chercherReservation(Client client, Vehicule vehicule, String dateDebut, String dateFin) {
        for (Reservation reservation : reservations) {
            if (reservation.getClient().equals(client) && reservation.getVehicule().equals(vehicule) &&
                    reservation.getDateeReservation().equals(dateDebut) && reservation.getDateFinReservation().equals(dateFin)) {
                return reservation;
            }
        }
        return null;
    }

}
