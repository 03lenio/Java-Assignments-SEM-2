package de.nulldrei.may.fourth;

import javax.swing.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*Ex. 1
        Countdown firstCountdown = new Countdown(5);
        Countdown secondCountdown = new Countdown(30);
        firstCountdown.run();
        secondCountdown.run();
         */
        //Ex. 2
        Random random = new Random();
        int[] dummy = new int[5];
        for (int i = 0; i<5; i++) {
            dummy[i] = random.nextInt(100);
            System.out.println(dummy[i]);
        }
        SmallestThread smallestThread = new SmallestThread(dummy);
        smallestThread.run();
        ThreadSum threadSum = new ThreadSum(dummy);
        threadSum.run();
        RoundThread roundThread = new RoundThread(dummy);
        roundThread.run();
    }

}
