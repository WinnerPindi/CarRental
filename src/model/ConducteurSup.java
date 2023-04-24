package model;

public class ConducteurSup {
    private String nom;
    private String prenom;
    private String telephone;
    private String numPermis;

    //Constructeur de la classe
    public ConducteurSup(String nom, String prenom, String telephone, String numPermis) {
        this.nom = nom;
        this.prenom = prenom;
        this.telephone = telephone;
        this.numPermis = numPermis;
    }
    // Getter et setter

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

    //Methode toString

    @Override
    public String toString() {
        return "ConducteurSup{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", numPermis='" + numPermis + '\'' +
                '}';
    }
}
