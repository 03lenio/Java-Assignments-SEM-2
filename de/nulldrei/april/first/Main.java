package de.nulldrei.april.first;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //Exercise 1
        for (int i = 10; i<=100; i++) {
            if(isPerfect(i)) {
                System.out.println(i + " is a perfect number");
            }
        }
        //Exercise 2
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
