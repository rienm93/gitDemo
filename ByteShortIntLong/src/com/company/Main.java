package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("BUSTED " + (myMinIntValue - 1));
        System.out.println("BUSTED TWO " + (myMaxIntValue + 1));

        int myMaxIntTest = 2147483647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);


        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println(myMinLongValue);
        System.out.println(myMaxLongValue);

        long myLongValue = 100L;

        byte myNewByteValue = (byte) (myMinByteValue / 2); // сюда дописали (byte) для того чтобы myMinByteValue вместо инта привести к байту и выражение сработало - Casting(Приведение типов)

        short myNewShrortValue = (short) (myMinShortValue /2);

        byte kek = 98;
        short pek= 1093;
        int sek = 99812;
        long test = 50000L + 10L *(kek + pek + sek);
        short test2 = (short)(50000 + 10 *(kek + pek + sek));//тут нужно приводить тип
        System.out.println(test);
        System.out.println(test2);


    }
}
