package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(area(5));
        System.out.println(area(5, 4));
    }
    public static double area(double radius){
        if (radius < 1){
            return -1;
        }else{
            return (Math.PI * Math.pow(radius, 2));
        }
    }
    public static double area(double x, double y){
        if (x < 1 || y < 1){
            return -1;
        }else{
            return x*y ;
        }

    }
}
