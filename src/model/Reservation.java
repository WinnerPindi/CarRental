/*
 * Cas d'utilisation : RESERVER VÉHICULE
 * PAR WINNER MAZONZIKA PINDI
 * */

package model;

public class Reservation {
    private Client client ;
    private Vehicule vehicule;
    private String dateeReservation;
    private String dateFinReservation;

    public Reservation(Client client, Vehicule vehicule, String dateeReservation, String dateFinReservation) {
        this.client = client;
        this.vehicule = vehicule;
        this.dateeReservation = dateeReservation;
        this.dateFinReservation = dateFinReservation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public String getDateeReservation() {
        return dateeReservation;
    }

    public void setDateeReservation(String dateeReservation) {
        this.dateeReservation = dateeReservation;
    }

    public String getDateFinReservation() {
        return dateFinReservation;
    }

    public void setDateFinReservation(String dateFinReservation) {
        this.dateFinReservation = dateFinReservation;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "client=" + client +
                ", vehicule=" + vehicule +
                ", dateeReservation='" + dateeReservation + '\'' +
                ", dateFinReservation='" + dateFinReservation + '\'' +
                '}';
    }
}
