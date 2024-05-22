package de.nulldrei.may.fourth;

public class SmallestThread implements Runnable {

    private int[] intArray;

    public SmallestThread(int[] intArray) {
        this.intArray = intArray;
    }

    @Override
    public void run() {
        int smallest = Integer.MAX_VALUE;
        for(int i : intArray) {
            if (i < smallest) {
                smallest = i;
            }
        }
        System.out.printf("Smallest element is %d\n", smallest);
    }
}
