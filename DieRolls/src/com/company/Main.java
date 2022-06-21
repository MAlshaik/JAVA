package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int Dice1 = rand.nextInt(5) +1;
        int Dice2 = rand.nextInt(5) +1;

        for(int i = 0; i<6; i++){
            System.out.println("Dice1   Dice2   Total");
            System.out.println(Dice1 + "       " + Dice2 + "       " + (Dice1 + Dice2));
            Dice1 = rand.nextInt(5) +1;
            Dice2 = rand.nextInt(5) +1;
        }
    }
}
