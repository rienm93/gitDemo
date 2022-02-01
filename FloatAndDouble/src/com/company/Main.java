package com.company;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum  = " + myMinFloatValue);
        System.out.println("Float maximum  = " + myMaxFloatValue);


        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum  = " + myMinDoubleValue);
        System.out.println("Double maximum  = " + myMaxDoubleValue);


        int myIntValue = 5 / 3;
        float myFloatValue = 5f /3f; // или так 5.25f или (float) 5.25
        double myDoubleValue = 5d /3d;
        System.out.println("myIntValue= " + myIntValue);
        System.out.println("myFloatValue= " + myFloatValue);
        System.out.println("myDoubleValue=" + myDoubleValue);

        double pounds = 0.45359237;
        double kilograms =3d;
        double result = kilograms * pounds;
        System.out.println(result);

    }
}
