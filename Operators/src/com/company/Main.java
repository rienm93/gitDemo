package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        //comment
        /*
        another comment
         */


        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!");
        } else if (isAlien == true) {
            System.out.println("PIZDEC!");
        } else {
            System.out.println("vse norm");
        }

        if (isAlien == true)
            System.out.println("it is not an alien!"); //если нет кавычек то выполнится только первая строка(если условие истино)
        System.out.println("i am scared of alines");


        int topScore = 80;
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("High Score!");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) { // || или
            System.out.println("Одно или оба утверждения истины");
        }

        int newValue = 50;
        if(newValue ==50) {
            System.out.println("not an error");
        }

        boolean isCar = false;
        if(!isCar) {
            System.out.println("nothing");
        }

        boolean wasCar = isCar ? true: false;  //тернарный оператор

        double myDouble = 20.00d;
        double twoDouble = 80.00d;
        double result1 = (myDouble + twoDouble) * 100.00;
        double remainder = result1 % 40.00d;
        System.out.println(remainder);
        boolean isNoRemainder = (remainder ==0) ? true:false;
        System.out.println("no remainder");
        if(!isNoRemainder) {
            System.out.println("have remainder");
        }
    }

}
