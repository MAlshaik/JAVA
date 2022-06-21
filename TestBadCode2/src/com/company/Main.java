package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> fibSeq = new ArrayList<Integer>();
        fibSeq.add(1);
        fibSeq.add(1);
        for (int i = 0; i < 50; i++) {
            fibSeq.add(fibSeq.get(i) + fibSeq.get((i + 1)));
            System.out.println(fibSeq.get(i));
        }
    }
}
