package de.nulldrei.april.second;

import java.io.*;
import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) throws IOException {
        //Ex.1
        System.out.println("I got: " + cubic(4));
        writeName();
        errorGenerator();
    }

    public static double cubic(double n) {
        if (n == 1) {
            return 1;
        } else {
            return Math.pow(n, 3) * cubic(n - 1);
        }
    }


    //Ex. 2
    public static void writeName() throws IOException {
        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("name.txt"))) {
            dataOutputStream.writeUTF("Lenio\nCabral Rosario");
            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    //Ex. 3
    public static void errorGenerator() throws IOException {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.err.println("Fick dich!");
            FileOutputStream fos = new FileOutputStream("errors.log", true);
            PrintWriter pw = new PrintWriter(fos);
            pw.println(LocalDateTime.now() + " Error: " + e.getMessage());
            pw.close();

        }
    }


}
