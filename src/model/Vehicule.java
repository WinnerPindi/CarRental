/*
 * Cas d'utilisation : ENREGISTRER UN VEHICULE
 * PAR JULIO BANGADEBIA
 * */
package model;

import enumeration.TypeVehicule;

public class Vehicule {
    private String marque;
    private int nbrePlace ;
    private String moteur;
    private String numImmatricule;
    private TypeVehicule typeVehicule;
    private String etat ;
    private String kilometrage;
    private boolean location;
    private boolean reservation ;

    public Vehicule(String marque, int nbrePlace, String moteur, String numImmatricule, TypeVehicule typeVehicule, String etat, String kilometrage) {
        this.marque = marque;
        this.nbrePlace = nbrePlace;
        this.moteur = moteur;
        this.numImmatricule = numImmatricule;
        this.typeVehicule = typeVehicule;
        this.etat = etat;
        this.kilometrage = kilometrage;
        location = false;
        reservation = false;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getNbrePlace() {
        return nbrePlace;
    }

    public void setNbrePlace(int nbrePlace) {
        this.nbrePlace = nbrePlace;
    }

    public String getMoteur() {
        return moteur;
    }

    public void setMoteur(String moteur) {
        this.moteur = moteur;
    }

    public String getNumImmatricule() {
        return numImmatricule;
    }

    public void setNumImmatricule(String numImmatricule) {
        this.numImmatricule = numImmatricule;
    }

    public TypeVehicule getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(TypeVehicule typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(String kilometrage) {
        this.kilometrage = kilometrage;
    }

    public boolean isLocation() {
        return location;
    }

    public void setLocation(boolean location) {
        this.location = location;
    }

    public boolean isReservation() {
        return reservation;
    }

    public void setReservation(boolean reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Vehicule{" +
                "marque='" + marque + '\'' +
                ", nbrePlace=" + nbrePlace +
                ", moteur='" + moteur + '\'' +
                ", numImmatricule='" + numImmatricule + '\'' +
                ", typeVehicule=" + typeVehicule +
                ", etat='" + etat + '\'' +
                ", kilometrage='" + kilometrage + '\'' +
                ", location=" + location +
                ", reservation=" + reservation +
                '}';
    }
}
