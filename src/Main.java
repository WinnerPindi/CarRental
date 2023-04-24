import controller.RegistreInscription;
import model.Client;
import model.ConducteurSup;

public class Main {
    public static void main(String[] args) {

        // Création d'un nouveau client
        Client client = new Client("Doe", "John", "0123456789", "123456789", "1234567890123456");

        // Ajout de deux conducteurs supplémentaires pour le client
        ConducteurSup conducteur1 = new ConducteurSup("Smith", "Jane", "0987654321", "987654321");
        ConducteurSup conducteur2 = new ConducteurSup("Williams", "Robert", "0123456789", "123456789");
        client.ajoutConducteurSup(conducteur1);
        client.ajoutConducteurSup(conducteur2);

        // Ajout du client au registre des clients
        RegistreInscription registreClient = new RegistreInscription();
        registreClient.inscriptionClient(client);

        // Affichage des détails du client
        System.out.println("Le client " + client.getPrenom() + " " + client.getNom() + " est inscrit avec succès !");
        System.out.println("Liste des conducteurs supplémentaires pour ce client :");
        for (ConducteurSup conducteurSup : client.getListConducteurSup()) {
            System.out.println(conducteurSup.toString());
        }

    }
}