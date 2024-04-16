package de.nulldrei.april.third;

import java.io.*;

public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private String field;
    private String secondField;

    public Student(String file) throws IOException {
        readFromFile(file);
    }

    public Student(String firstName, String lastName, int age, String field, String secondField) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.field = field;
        this.secondField = secondField;
    }

    public void writeToFile(String file) throws IOException {
        FileOutputStream fs = new FileOutputStream(file);
        DataOutputStream ds = new DataOutputStream(fs);
        ds.writeUTF("First Name: " + getFirstName() +
                "\nLast Name: " + getLastName() +
                "\nAge:" + getAge() +
                "\nField: " + getField() +
                "\nSecond Field: " + getSecondField());
        ds.close();
    }

    public void readFromFile(String file) throws IOException {
        FileInputStream fs = new FileInputStream(file);
        DataInputStream ds = new DataInputStream(fs);
        System.out.println(ds.readUTF());
        ds.close();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getSecondField() {
        return secondField;
    }

    public void setSecondField(String secondField) {
        this.secondField = secondField;
    }
}
