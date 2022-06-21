package com.company;

public class Main {

    public static void main(String[] args) {

       boolean s= true;
       boolean t= true;
       boolean u = true;

       boolean r = !(s || t) || t && (s || u);
        System.out.println(r);
    }
}
