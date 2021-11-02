package com.pc.concepts.hackerRank;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Stack<Character> st = new Stack<>();

        for (int i = 0 ; i < str.length() ; i++) {
            Character c = str.charAt(i);

            if (c.equals('(') || c.equals('{') || c.equals('[')) {
                st.push(c);
            } else if (c.equals(')')) {
                 handleClosing(st,c);
            } else if (c.equals('}')) {
                 handleClosing(st,c);
            } else if (c.equals(']')) {
                 handleClosing(st,c);
            }
        }
        if (st.size() == 0) {
            System.out.println("It is a valid balanced brackets");
        }
    }

    public static void handleClosing(Stack<Character> st ,char c) {
        // the closing bracket is extra
        if (st.size() == 0) {
            System.out.println(false);
            return ;
        } else if (!st.peek().equals(c)) {
            System.out.println(false);
            return ;
        } else {
            st.pop();
        }
    }
}
