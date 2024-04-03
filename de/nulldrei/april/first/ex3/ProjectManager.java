package de.nulldrei.april.first.ex3;

public class ProjectManager implements IPayableEmployee {

    private double baseSalary;
    private double bonusSalary;

    public ProjectManager(double baseSalary, double bonusSalary) {
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
        return baseSalary + (individualBonusFactor*2) * bonusSalary;
    }

}
