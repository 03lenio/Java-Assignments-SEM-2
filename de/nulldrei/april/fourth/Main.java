package de.nulldrei.april.fourth;

import javax.swing.*;
import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Ex. 1
        FileOutputStream fileOutputStream = new FileOutputStream("04-23-2024.txt", true);
        PrintWriter pw = new PrintWriter(fileOutputStream);
        pw.println("Cabral Rosario, Computer Science");
        pw.flush();
        pw.close();
        FileInputStream fileInputStream = new FileInputStream("04-23-2024.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
        System.out.println(reader.readLine());
        inputStreamReader.close();
        reader.close();
        fileInputStream.close();
        fileOutputStream.close();
        //Ex. 2
        Home mainHome = new Home("Main St", 10, 49333, "Columbus", 500, 100, true, 100);Home home = new Home("Main St", 10, 49333, "Columbus", 500, 100, true, 100);
        Home secondHome = new Home("Second St", 10, 49333, "Columbus", 500, 100, true, 100);
        Home thirdHome = new Home("5th Ave", 10, 49333, "Columbus", 500, 100, true, 100);
        Home[] homes = new Home[]{mainHome, secondHome, thirdHome};
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("homes.csv"));
        for (Home homeToWrite : homes) {
            bufferedWriter.append(homeToWrite.toCSV() + "\n");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
        Home[] homesFromCSV = new Home[3];
        BufferedReader bufferedReader = new BufferedReader(new FileReader("homes.csv"));
        int index = 0;
        for(String line : bufferedReader.lines().toList()) {
            Home homeToAppend = new Home(line.split(",")[0], Integer.parseInt(line.split(",")[1]), Integer.parseInt(line.split(",")[2]), line.split(",")[3], Double.parseDouble(line.split(",")[4]), Double.parseDouble(line.split(",")[5]), Boolean.getBoolean(line.split(",")[6]), Double.parseDouble(line.split(",")[7]));
            homesFromCSV[index] = homeToAppend;
            System.out.println(homeToAppend.toString());
        }
        //Ex. 4
        simplePasswordGenerator();
        //Ex. 5
        Student firstStudent = new Student("Jan", "Marvin", 5, "Informatik", "Ohiokunde");
        Student secondStudent = new Student("Yeat", "Smith", 2093, "Cyber-Security", "Computer-Science");
        FileOutputStream studentFileOutputStream = new FileOutputStream("students.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(studentFileOutputStream);
        objectOutputStream.writeObject(firstStudent);
        objectOutputStream.writeObject(secondStudent);
        objectOutputStream.flush();
        objectOutputStream.close();
        studentFileOutputStream.close();
        FileInputStream objectFileInputStream = new FileInputStream("students.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(objectFileInputStream);
        Student firstSerializedStudent = (Student) objectInputStream.readObject();
        Student secondSerializedStudent = (Student) objectInputStream.readObject();
        System.out.printf("%s %s%n", firstSerializedStudent.getFirstName(), firstSerializedStudent.getLastName());
        System.out.printf("%s %s%n", secondSerializedStudent.getFirstName(), secondSerializedStudent.getLastName());
    }

    public static void simplePasswordGenerator() throws IOException {
        String site = JOptionPane.showInputDialog("Please enter the site you want to generate a password for: ");
        int passLength = Integer.parseInt(JOptionPane.showInputDialog("Please enter the desired length of your password as integer: "));
        String allowedChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        String[] passwordArray = new String[passLength];
        for(int i = 0; i < passLength; i++) {
            passwordArray[i] = String.valueOf(allowedChars.charAt(random.nextInt(allowedChars.length())));
        }
        String password = String.join("", passwordArray);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("passwords.txt", true));
        bufferedWriter.append(String.format("%s = %s\n", site, password));
        bufferedWriter.flush();
        bufferedWriter.close();
    }

}
