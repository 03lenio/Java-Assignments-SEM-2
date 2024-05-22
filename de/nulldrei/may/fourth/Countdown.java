package de.nulldrei.may.fourth;

public class Countdown implements Runnable {

    private int seconds;

    public Countdown(int seconds) {
        this.seconds = seconds;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public void run() {
        while(seconds>0) {

            try {
                Thread.sleep(1000);
                System.out.println(String.format("%d Seconds remaining", seconds--));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Reached 0!");

    }
}
