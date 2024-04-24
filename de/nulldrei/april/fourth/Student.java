package de.nulldrei.april.fourth;

import java.io.*;

public class Student implements Serializable {

    private String firstName;
    private String lastName;
    private int age;
    private String field;
    private String secondField;

    public Student(String firstName, String lastName, int age, String field, String secondField) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.field = field;
        this.secondField = secondField;
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
