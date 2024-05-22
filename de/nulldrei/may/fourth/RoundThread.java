package de.nulldrei.may.fourth;

public class RoundThread implements Runnable {

    private int[] intArray;

    public RoundThread(int[] intArray) {
        this.intArray = intArray;
    }

    @Override
    public void run() {
        int count = 0;
        for(int i : intArray) {
            if ((i%2) ==0) {
                count++;
            }
        }
        System.out.printf("There are %d round numbers in the array\n", count);
    }
}
