package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println( areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println( areEqualByThreeDecimalPlaces(3.175,3.176));
        System.out.println( areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println( areEqualByThreeDecimalPlaces(-3.123,3.123));
    }

    public static boolean areEqualByThreeDecimalPlaces(double one, double two) {
        int first = (int)(one*1000);
        int second = (int)(two*1000);
        if(first  ==  second) {
            System.out.println("one: " +  first + " " + "two " + second);
            return true;
        }    System.out.println("one: " +  first + " " + "two " + second);
            return false;
    }
}
