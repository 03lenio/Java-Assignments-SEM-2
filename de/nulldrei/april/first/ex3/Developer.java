package de.nulldrei.april.first.ex3;

public class Developer implements IPayableEmployee {

    private double baseSalary;
    private double bonusSalary;

    public Developer(double baseSalary, double bonusSalary) {
        this.baseSalary = baseSalary;
        this.bonusSalary = bonusSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    @Override
    public double calculateSalary(double individualBonusFactor) {
        return baseSalary + individualBonusFactor * bonusSalary;
    }
}
