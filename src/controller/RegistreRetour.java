package controller;

import model.Location;
import model.RetourVehicule;

import java.util.ArrayList;
import java.util.List;

public class RegistreRetour {
    private List<RetourVehicule> retours;

    public RegistreRetour() {
        this.retours = new ArrayList<>();
    }

    public void ajouterRetour(Location location, String dateRetour, double kilometrageRetour) {
        RetourVehicule retour = new RetourVehicule(location, dateRetour, kilometrageRetour);
        this.retours.add(retour);
    }

    public List<RetourVehicule> getListeRetours() {
        return this.retours;
    }

    public List<RetourVehicule> rechercherRetours(Location location, String dateRetour) {
        List<RetourVehicule> resultats = new ArrayList<>();

        for (RetourVehicule retour : this.retours) {
            if (retour.getLocation().equals(location) && retour.getDateRetour().equals(dateRetour)) {
                resultats.add(retour);
            }
        }

        return resultats;
    }

    public List<RetourVehicule> rechercherRetours(String recherche) {
        List<RetourVehicule> resultats = new ArrayList<>();

        for (RetourVehicule retour : this.retours) {
            if (retour.toString().contains(recherche)) {
                resultats.add(retour);
            }
        }

        return resultats;
    }

    public void supprimerRetour(RetourVehicule retour) {
        this.retours.remove(retour);
    }
}
