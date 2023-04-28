
import controller.RegistreReservation;
import controller.RegistreVoiture;
import enumeration.TypeVehicule;
import model.Client;
import model.Reservation;
import model.Vehicule;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RegistreReservation registre = new RegistreReservation();
        // Créer quelques clients et véhicules
        Client client1 = new Client("Doe", "John", "0123456789", "123456789", "1234567890123456");
        Client client2 = new Client("Dan", "Nsakamadesu", "0123456789", "123456789", "1234567890123456");
        Vehicule vehicule1 = new Vehicule("Renault", 4, "Essence", "AA-123-BB", TypeVehicule.SIMPLE, "Bon état", "100 000 km");
        Vehicule vehicule2 = new Vehicule("Peugeot", 5, "Diesel", "BB-456-CC", TypeVehicule.PRESTIGE, "Mauvais état", "200 000 km");

        // Ajouter des réservations
        registre.ajouterReservation(client1, vehicule1, "2023-05-01", "2023-05-07");
        registre.ajouterReservation(client2, vehicule2, "2023-05-03", "2023-05-06");
        registre.ajouterReservation(client1, vehicule2, "2023-05-08", "2023-05-10");

        // Afficher la liste des réservations
        List<Reservation> reservations = registre.getReservations();
        for (Reservation reservation : reservations) {
            System.out.println(reservation);
        }

        // Rechercher des réservations par client
        System.out.println("Réservations pour " + client1.getNom() + " :");
        List<Reservation> reservationsClient1 = registre.chercherReservations(client1);
        for (Reservation reservation : reservationsClient1) {
            System.out.println(reservation);
        }

        // Rechercher des réservations par véhicule
        System.out.println("Réservations pour " + vehicule2.getMarque() + " " + vehicule2.getTypeVehicule() + " :");
        List<Reservation> reservationsVehicule2 = registre.chercherReservations(vehicule2);
        for (Reservation reservation : reservationsVehicule2) {
            System.out.println(reservation);
        }

        // Rechercher des réservations par dates
        System.out.println("Réservations du 2023-05-01 au 2023-05-07 :");
        List<Reservation> reservationsDates = registre.chercherReservations("2023-05-01", "2023-05-07");
        for (Reservation reservation : reservationsDates) {
            System.out.println(reservation);
        }

        // Rechercher une réservation spécifique
        Reservation reservation = registre.chercherReservation(client2, vehicule2, "2023-05-03", "2023-05-06");
        System.out.println("Réservation trouvée : " + reservation);
    }



}