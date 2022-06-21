package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.println( scoresIncreasing(new int[]{1, 2, 3}));
        System.out.println( scoresIncreasing(new int[]{1, 3, 2}));
        System.out.println( scoresIncreasing(new int[]{-5, 4, 11}));

    }

    public static boolean scoresIncreasing(int[] scores) {
        int index = scores.length;
        int num = scores.length;
        while(index <= num){
            if (scores[index -1] >= scores[index - 2]) {
                if (index > 2) {
                    index = index - 1;
                }else{
                    return true;
                }
            }else{
                return false;
            }
        }
        return false;
    }
}
