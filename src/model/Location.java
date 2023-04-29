/*
 * Cas d'utilisation : LOCATION D'UN VEHICULE POUR LE CLIENT
 * PAR JULIO BANGADEBIA
 * */
package model;

public class Location {
    private Client client;
    private Vehicule vehicule;
    private String dateDebut;
    private String dateFin;
    private double prix;

    public Location(Client client, Vehicule vehicule, String dateDebut, String dateFin, double prix) {
        this.client = client;
        this.vehicule = vehicule;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.prix = prix;
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

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Location{" +
                "client=" + client +
                ", vehicule=" + vehicule +
                ", dateDebut=" + dateDebut +
                ", dateFin=" + dateFin +
                ", prix=" + prix +
                '}';
    }
}
