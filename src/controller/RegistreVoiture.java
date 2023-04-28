package controller;

import enumeration.TypeVehicule;
import model.Vehicule;

import java.util.ArrayList;
import java.util.List;

public class RegistreVoiture {
    private List<Vehicule> vehicules;

    public RegistreVoiture() {
        vehicules = new ArrayList<>();
    }

    public void ajouterVehicule(String marque, int nbrePlace, String moteur, String numImmatricule, TypeVehicule typeVehicule, String etat, String kilometrage) {
        Vehicule vehicule = new Vehicule(marque, nbrePlace, moteur, numImmatricule, typeVehicule, etat, kilometrage);
        vehicules.add(vehicule);
    }

    public List<Vehicule> getVehiculesDisponibles() {
        List<Vehicule> vehiculesDisponibles = new ArrayList<>();
        for (Vehicule vehicule : vehicules) {
            if (!vehicule.isLocation() && !vehicule.isReservation()) {
                vehiculesDisponibles.add(vehicule);
            }
        }
        return vehiculesDisponibles;
    }

    public void reserverVehicule(String numImmatricule) throws Exception {
        for (Vehicule vehicule : vehicules) {
            if (vehicule.getNumImmatricule().equals(numImmatricule) && !vehicule.isLocation() && !vehicule.isReservation()) {
                vehicule.setReservation(true);
                return;
            }
        }
        throw new Exception("Le véhicule n'est pas disponible.");
    }

    public void louerVehicule(String numImmatricule) throws Exception {
        for (Vehicule vehicule : vehicules) {
            if (vehicule.getNumImmatricule().equals(numImmatricule) && vehicule.isReservation()) {
                vehicule.setReservation(false);
                vehicule.setLocation(true);
                return;
            }
        }
        throw new Exception("Le véhicule n'a pas été réservé.");
    }

    public void retournerVehicule(String numImmatricule) throws Exception {
        for (Vehicule vehicule : vehicules) {
            if (vehicule.getNumImmatricule().equals(numImmatricule) && vehicule.isLocation()) {
                vehicule.setLocation(false);
                return;
            }
        }
        throw new Exception("Le véhicule n'a pas été loué.");
    }
}
