package com.company;

public class Main {

    public static void main(String[] args) {

        int number = 2;
        if (number <= 1)
            System.out.println("Not prime");;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Not prime");;
            }
        }

        System.out.println("is prime");;




    }
}