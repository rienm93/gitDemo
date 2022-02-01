package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + " smoe more";
        System.out.println("and kek " + myString);
        myString = myString + " \u00A9 2019";
        System.out.println(myString);
        myString+= " kekekek";
        System.out.println(myString);
        String numberString = "397.122";
        numberString+="882.11";
        System.out.println(numberString);
        String lstString = "10";
        int myInt = 50;
        lstString +=myInt;
        System.out.println(lstString);
        double dnumber = 120.47d;
        lstString+=dnumber;
        System.out.println(lstString);

    }
}
