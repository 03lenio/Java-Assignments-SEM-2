package de.nulldrei.april.first.ex2;

public class Car {

    private String make;
    private int modelYear;
    private boolean[] tiresFunctional;

    public Car(String make, int modelYear, boolean[] tiresFunctional) {
        this.make = make;
        this.modelYear = modelYear;
        this.tiresFunctional = tiresFunctional;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public boolean[] getTiresFunctional() {
        return tiresFunctional;
    }

    public void setTiresFunctional(boolean[] tiresFunctional) {
        this.tiresFunctional = tiresFunctional;
    }

    public boolean allTiresFunctional() {
        for(boolean functional : tiresFunctional) {
            if(!functional) {
                return false;
            }
        }
        return true;
    }
}
