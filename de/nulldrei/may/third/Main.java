package de.nulldrei.may.third;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        /* Ex 1
        NoDuplicateStringList noDuplicateStringList = new NoDuplicateStringList();
        noDuplicateStringList.add("s");
        noDuplicateStringList.add("s");
        noDuplicateStringList.add("d");
        noDuplicateStringList.add("g");
        noDuplicateStringList.add("h");
        noDuplicateStringList.printAllElements();
         */
        /* Ex. 2
        LinkedList<Integer> queue = new LinkedList<Integer>();
        Random random = new Random();
        for(int i=0; i<10; i++) {
            queue.add(random.nextInt(50));
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.pop() * random.nextInt(1, 9));
        }
         */
        System.out.println(checkBD("bddbdbbbd"));
        System.out.println(checkParenthesis("{}{}{{}{}}{}{(({})){})}{}{}"));
    }

    public static boolean checkBD(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            stack.add(c);
        }
        int dOccurences = 0;
        int bOccurences = 0;
        while (!stack.isEmpty()){
            char val = stack.pop();
            if(val == 'b') {
                bOccurences++;
            }
            else if(val == 'd') {
                dOccurences++;
            }
        }
        return dOccurences == bOccurences;
    }

    public static boolean checkParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(') {
                stack.push(c);
            } else {
                if ((c == ')' && stack.peek() != '(') || (c == '}' && stack.peek() != '{')) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }


}
