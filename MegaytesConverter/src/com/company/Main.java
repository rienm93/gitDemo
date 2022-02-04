package com.company;

public class Main {

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(43000);
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes) {

        if(kilobytes< 0) {
            System.out.println("Invalid Value");
        }
        else {
            int megabytes = kilobytes / 1024;
            int remaining = kilobytes % 1024;
            System.out.println(kilobytes + " KB = " + megabytes+ " MB " + " and " + remaining + " KB");
        }

    }
}
