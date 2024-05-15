package de.nulldrei.may.third;

import java.util.LinkedList;

public class NoDuplicateStringList {

    private LinkedList<String> linkedList = new LinkedList<>();

    public NoDuplicateStringList() {

    }

    public boolean add(String s) {
        if(!linkedList.contains(s)) {
            linkedList.add(s);
            return true;
        }
        return false;
    }

    public void printAllElements() {
        for(String s : linkedList) {
            System.out.println(s);
        }
    }

}
