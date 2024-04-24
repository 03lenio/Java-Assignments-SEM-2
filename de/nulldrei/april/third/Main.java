package de.nulldrei.april.third;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Main {

    /*
    public static void main(String[] args) throws IOException {
        //Ex. 1
        System.out.println(palindrome("OTTO"));

        //Ex. 2
        Student student = new Student("Jan", "Marvin", 5, "Informatik", "Ohiokunde");
        student.writeToFile("marvler.txt");
        Student studentReader = new Student("marvler.txt");

        //Ex. 3
        errorGenerator();
    }
    */

    public static boolean palindrome(String word) {
        if(word.length() == 1 || word.isEmpty())
            return true;
        if(word.charAt(word.length()-1) == word.charAt(0)) {
            System.out.println(word.substring( 1, word.length() - 1 ));
            return palindrome(word.substring(1, word.length() - 1 ));
        }

        return false;
    }

    public static void errorGenerator() throws IOException {
        try {
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.err.println("Du du lass das durch 0 soll man nicht teilen!");
            FileWriter fos = new FileWriter("error.log");
            BufferedWriter bw = new BufferedWriter(fos);
            bw.write(LocalDateTime.now() + " Error: " + e.toString());
            bw.flush();
            bw.close();
        }
    }
}
