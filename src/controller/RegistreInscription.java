/*
 * Cas d'utilisation : Créer un nouveau client
 * PAR WINNER MAZONZIKA PINDI
 * */
package controller;

import model.Client;
import model.ConducteurSup;

import java.util.ArrayList;

public class RegistreInscription {
    private ArrayList<Client> listeClients;

    public RegistreInscription(){
        this.listeClients = new ArrayList<>();
    }

    // Ajouter un nouveau client
    public void inscriptionClient(Client client){
        listeClients.add(client);
    }

    // Retourner la liste de tous les client
    public ArrayList<Client> getListeClients(){
        return listeClients;
    }

    // Retour la liste de conducteurs supplémentaire pour un client donnée
    public ArrayList<ConducteurSup> getListeConducteursSup(Client client){
        return client.getListConducteurSup();
    }

    //Ajouter un conducteur supplémantaire pour un client donnée
    public  void ajouterConducteurSup(Client client, ConducteurSup conducteurSup){
        client.ajoutConducteurSup(conducteurSup);
    }

}
