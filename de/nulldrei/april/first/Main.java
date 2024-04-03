package de.nulldrei.april.first;

import de.nulldrei.april.first.ex2.Car;
import de.nulldrei.april.first.ex3.Developer;
import de.nulldrei.april.first.ex3.ProjectManager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Exercise 1
        System.out.println("==========What are the perfect numbers from 10-100?=========");
        for (int i = 10; i<=100; i++) {
            if(isPerfect(i)) {
                System.out.println(i + " is a perfect number");
            }
        }
        System.out.println("============================================================");
        //Exercise 2
        Car car = new Car("DOGE CHALLENGER SRT® HELLCAT ", 2023, new boolean[] {true, true, true, true});
        System.out.println("==========Car=========" +
                "\nMake: " + car.getMake() +
                "\nModel Year: " + car.getModelYear() +
                "\nAll tires functional: " + car.allTiresFunctional() +
                "\n======================");
        //Exercise 3
        Developer developer = new Developer(50000, 3000);
        System.out.println("==========Salary of a Developer=========" +
                "\nA Developer with a 50k base salary and a 3k bonus salary makes " + developer.calculateSalary(1.03) + " with the individual bonus factor of 1.03%" +
                "\n========================================");
        ProjectManager projectManager = new ProjectManager(40000, 10000);
        System.out.println("==========Salary of a Project Manager=========" +
                "\nA project manager with a 40k base salary and a 10k bonus salary makes " + developer.calculateSalary(1.05) + " with the individual bonus factor of 1.05%" +
               "\n==============================================");
    }

    public static boolean isPerfect(int toCheck) {
        int lastSum = 0;
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i = 1; i<=100; i++) {
            if((toCheck % i) == 0) {
                if(i != toCheck) {
                    divisors.add(i);
                }
            }
        }
        for(int divisor : divisors) {
            lastSum = lastSum + divisor;
        }
        return lastSum == toCheck;
    }

}
