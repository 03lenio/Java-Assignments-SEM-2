package de.nulldrei.may.fourth;

public class ThreadSum implements Runnable {

    private int[] intArray;

    public ThreadSum(int[] intArray) {
        this.intArray = intArray;
    }

    @Override
    public void run() {
        int sum = 0;
        for(int i : intArray) {
            sum += i;
        }
        System.out.printf("Sum is %d\n", sum);
    }
}
