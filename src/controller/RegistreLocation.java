/*
 * Cas d'utilisation : LOCATION D'UN VEHICULE POUR LE CLIENT
 * PAR JULIO BANGADEBIA
 * */
package controller;

import model.Client;
import model.Location;
import model.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class RegistreLocation {
    private List<Location> locations;

    public RegistreLocation() {
        this.locations = new ArrayList<>();
    }

    public void ajouterLocation(Client client, Vehicule vehicule, String dateDebut, String dateFin, double prix) {
        Location location = new Location(client, vehicule, dateDebut, dateFin, prix);
        this.locations.add(location);
    }

    public List<Location> getListeLocations() {
        return this.locations;
    }

    public List<Location> rechercherLocations(Client client, Vehicule vehicule, String dateDebut, String dateFin) {
        List<Location> resultats = new ArrayList<>();

        for (Location location : this.locations) {
            if (location.getClient().equals(client) && location.getVehicule().equals(vehicule) && location.getDateDebut().equals(dateDebut) && location.getDateFin().equals(dateFin)) {
                resultats.add(location);
            }
        }

        return resultats;
    }

    public List<Location> rechercherLocations(String recherche) {
        List<Location> resultats = new ArrayList<>();

        for (Location location : this.locations) {
            if (location.toString().contains(recherche)) {
                resultats.add(location);
            }
        }

        return resultats;
    }

    public void supprimerLocation(Location location) {
        this.locations.remove(location);
    }


}
