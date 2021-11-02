package com.pc.concepts.stringprob;

import java.util.Arrays;

public class RemoveSpecialChar {
    public static void main(String[] args) {


        String str = "Abd3$7)bswe*";

        String str1 = str.replaceAll("[^a-zA-Z0-9]",""); //anything other than specified in the regex
        System.out.print(str1);

        //remove white spaces

        System.out.println(" ");
        String string1 = "k ue u 6 9 s   ";
        String strTrim = string1.trim();
        System.out.println(strTrim);
        String str2 = string1.replaceAll("\\s",""); //unicode value  - \\s for single space
        System.out.print(str2);


        //remove duplicates


        //approach1
        String strng = "Pratheeka";
        StringBuilder builder = new StringBuilder();
        strng.chars().distinct().forEach(i -> builder.append(((char) i)));

        System.out.println(builder);

        System.out.println("");

        //sort in natural ordering

        String str23 = "Strong" ;

        char[] charArry = str23.toCharArray();

        char temp ;
        for (int i = 0 ; i < charArry.length; i++) {

            for (int j=i + 1; j<charArry.length; j++) {
                if (charArry[i] > charArry[j])
                {
                    temp = charArry[i];
                    charArry[i] = charArry[j];
                    charArry[j] = temp;
                }
            }
        }
        System.out.println(charArry);
    }
}
