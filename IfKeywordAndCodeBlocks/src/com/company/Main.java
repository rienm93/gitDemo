package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gaveOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was  less or equal than 5000");
        } else if (score < 1000) {
            System.out.println("Your score less than 1000");
        } else {
            System.out.println("something");
        }

        if (gaveOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        if (gaveOver) {
            score = 10000;
            levelCompleted = 8;
            bonus = 200;
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("Your second score was " + secondScore);
        }

        int highScore;
        highScore = calculateScore(500, 5, 100);

        System.out.println(calculateScore(90, 3, 1));
        System.out.println(calculateScore(10000, 8, 200));

        displayHighScorePosition("Cartman",calculateHighScorePosition(1500));
        displayHighScorePosition("Kenny",calculateHighScorePosition(900));
        displayHighScorePosition("Stan",calculateHighScorePosition(400));
        displayHighScorePosition("Kyle",calculateHighScorePosition(50));
    }

    public static int calculateScore(int score, int levelCompleted, int bonus) {
        int finalScore = score + (levelCompleted * bonus);
        System.out.println("your final solution is " + finalScore);
        return finalScore;
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position;
        if(score >= 1000) {
            position = 1;
        }
        else if(score >=500) {
            position = 2;
        }
        else if( score >=100){
            position = 3;
        }
        else {
            position = 4;
        }
        return position;
    }

}
