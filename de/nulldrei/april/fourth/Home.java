package de.nulldrei.april.fourth;

public class Home {

    String streetName;
    int houseNumber;
    int zip;
    String city;
    double estateArea;
    double livingArea;
    boolean doesParkingSpaceExist;
    double price;

    public Home(String streetName, int houseNumber, int zip, String city, double estateArea, double livingArea, boolean doesParkingSpaceExist, double price) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.zip = zip;
        this.city = city;
        this.estateArea = estateArea;
        this.livingArea = livingArea;
        this.doesParkingSpaceExist = doesParkingSpaceExist;
        this.price = price;
    }

    public String toString() {
        return String.format("Street name: %s, House number: %d, Zip-Code: %d, City: %s, Estate area: %f, Living area: %f, Does parking space exist? %s, Price: %f", getStreetName(), getHouseNumber(), getZip(), getCity(), getEstateArea(), getLivingArea(), isDoesParkingSpaceExist(), getPrice());
    }

    public String toCSV() {
        return String.format("%s,%d,%d,%s,%f,%f,%s,%f", getStreetName(), getHouseNumber(), getZip(), getCity(), getEstateArea(), getLivingArea(), isDoesParkingSpaceExist(), getPrice());
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getEstateArea() {
        return estateArea;
    }

    public void setEstateArea(double estateArea) {
        this.estateArea = estateArea;
    }

    public double getLivingArea() {
        return livingArea;
    }

    public void setLivingArea(double livingArea) {
        this.livingArea = livingArea;
    }

    public boolean isDoesParkingSpaceExist() {
        return doesParkingSpaceExist;
    }

    public void setDoesParkingSpaceExist(boolean doesParkingSpaceExist) {
        this.doesParkingSpaceExist = doesParkingSpaceExist;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
