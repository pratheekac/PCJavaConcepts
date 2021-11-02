package com.pc.concepts.stringprob;

public class ReverseAString {

    public static void main(String[] args) {

        String str = "ABCD";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
