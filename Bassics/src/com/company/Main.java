package com.company;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
         int[][] m = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 0},
                {6, 7, 1, 2, 5},
                {6, 7, 8, 9, 0},
                {5, 4, 3, 2, 1}};
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; i++) {
                if(i > 1) {
                    sum1 += m[i][j];
                    sum2 += m[i - 1][j];
                    if (sum1 == sum2) {
                        System.out.println("false");
                    }
                }
            }

        }



    }
    }


