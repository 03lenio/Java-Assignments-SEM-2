package de.nulldrei.may.third;

import java.util.Stack;

public class Main {
    /*
    public static void main(String[] args) {
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
 
     */
}
