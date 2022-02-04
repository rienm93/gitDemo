package com.company;

public class Main {

    public static void main(String[] args) {
        checkNumber(3);
        checkNumber(-2);
        checkNumber(0);
    }

    public static void checkNumber(int Number) {
        if (Number > 0) {
            System.out.println("Positive");
        } else if (Number < 0) {
            System.out.println("Negative");
        } else if (Number == 0) {
            System.out.println("zero");
        }
    }
}
