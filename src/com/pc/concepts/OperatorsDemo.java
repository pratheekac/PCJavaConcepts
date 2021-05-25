package com.pc.concepts;

/**
 * Shorthand Opretors - +=,-=,*=...
 */
public class OperatorsDemo {

    public static void main(String[] args) {

        int i = 5;

        i = i+2;

        System.out.println(i);

        i += 2;

        System.out.println(i);

        i =+ 2;

        System.out.println(i);

        i -= 2;

        System.out.println(i);

        //i = i * 2.4; //gives error
        i *= 2;



        System.out.println(i);

    }
}
