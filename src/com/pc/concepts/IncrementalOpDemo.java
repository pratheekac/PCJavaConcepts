package com.pc.concepts;

public class IncrementalOpDemo {

    public static void main(String[] args) {
        int i = 5;

        int j = i;

        int k = i++;//still 5 (cos its post icremental)

        int m = ++j;

        System.out.println(j);
        System.out.println(k);
        System.out.println(m);
    }
}
