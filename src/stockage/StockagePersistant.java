package stockage;

import model.Client;
import model.Reservation;
import model.Vehicule;

import java.util.ArrayList;

public class StockagePersistant {
    private BaseDeDonnee baseDeDonnee;

    public void sauvegarderClient(Client client){
        baseDeDonnee.clients.add(client);
    }

    public void sauvegarderVehicule(Vehicule vehicule){
        baseDeDonnee.vehicules.add(vehicule);
    }
    public void sauvegarderReservation(Reservation reservation){
        baseDeDonnee.reservations.add(reservation);
    }
    public Client recupererClient(String numeroDossier) {
        for (Client client : baseDeDonnee.clients) {
            if (client.getNumeroDossier().equals(numeroDossier)) {
                return client;
            }
        }
        return null;
    }

    public Vehicule recupererVehicule(String numImmatricule) {
        for (Vehicule vehicule : baseDeDonnee.vehicules) {
            if (vehicule.getNumImmatricule().equals(numImmatricule)) {
                return vehicule;
            }
        }
        return null;
    }


}
