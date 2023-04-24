package model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {
    private String nom;
    private String prenom;
    private String telephone;
    private String numPermis;
    private String carteBancaire;
    private ArrayList<ConducteurSup> listConducteurSup;

    //Constructeur de la classe
    public Client(String nom, String prenom, String telephone, String numPermis, String carteBancaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.numPermis = numPermis;
        this.carteBancaire = carteBancaire;
        this.listConducteurSup = new ArrayList<>();
    }

    // Getter et Setter


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNumPermis() {
        return numPermis;
    }

    public void setNumPermis(String numPermis) {
        this.numPermis = numPermis;
    }

    public String getCarteBancaire() {
        return carteBancaire;
    }

    public void setCarteBancaire(String carteBancaire) {
        this.carteBancaire = carteBancaire;
    }

    public ArrayList<ConducteurSup> getListConducteurSup() {
        return listConducteurSup;
    }

    public void setListConducteurSup(ArrayList<ConducteurSup> listConducteurSup) {
        this.listConducteurSup = listConducteurSup;
    }

    // Methode permettant d'ajouter un conducteur supplemantaire

    public void ajoutConducteurSup (ConducteurSup conducteurSup) {
        listConducteurSup.add(conducteurSup);
    }

    //Methode toString

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", numPermis='" + numPermis + '\'' +
                ", carteBancaire='" + carteBancaire + '\'' +
                ", listConducteurSup=" + listConducteurSup +
                '}';
    }
}
