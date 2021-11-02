package com.pc.concepts;

public class ShiftOpDemo {

    public static void main(String[] args) {

        int i = 8; //1000
        int j = i << 2; //100000 (32)

        System.out.println(j);

        int m = 8; //1000
        int n = m >> 2; //0010 (2)

        System.out.println(n);

    }
}

