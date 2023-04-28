package model;

public class RetourVehicule {
    private Location location;
    private String dateRetour;
    private double kilometrageRetour;

    public RetourVehicule(Location location, String dateRetour, double kilometrageRetour) {
        this.location = location;
        this.dateRetour = dateRetour;
        this.kilometrageRetour = kilometrageRetour;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDateRetour() {
        return dateRetour;
    }

    public void setDateRetour(String dateRetour) {
        this.dateRetour = dateRetour;
    }

    public double getKilometrageRetour() {
        return kilometrageRetour;
    }

    public void setKilometrageRetour(double kilometrageRetour) {
        this.kilometrageRetour = kilometrageRetour;
    }

    @Override
    public String toString() {
        return "RetourVehicule{" +
                "location=" + location +
                ", dateRetour=" + dateRetour +
                ", kilometrageRetour=" + kilometrageRetour +
                '}';
    }
}
