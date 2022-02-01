package com.company;

public class Main {

    public static void main(String[] args) {
        char myChar = 'D';
        char myUnicodeChar = '\u0044'; // в char можно хранить юникод
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char copyright = '\u00A9';
        System.out.println(copyright);

        boolean myTrue = true;
        boolean myFalse = false;

    }
}
