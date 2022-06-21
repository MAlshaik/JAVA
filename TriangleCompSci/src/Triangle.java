//Name -
//Date -
//Class -
//Lab  -	Label & identify the parts of the class/methods

import java.util.Scanner;
import java.lang.Math.*;

public class Triangle // class deceleration
{
	private int sideA, sideB, sideC;  //declare instance variables
	private double perimeter; //declare instance variables
	private double theArea; //declare instance variables

	public Triangle() // default constructor
	{
	   setSides(0,0,0); // modifier method call
	   
	   perimeter=0; //initialize instance variables
	   theArea=0; //initialize instance variables
	}

	public Triangle(int a, int b, int c) //initialization constructive
	{
		setSides(a,b,c); // modifier method call

		perimeter=0; //initialize instance variables
		theArea=0; //initialize instance variables

	}


	public void setSides(int a, int b, int c) // modifier method
	{
		sideA = a; //initialize instance variables
		sideB = b; //initialize instance variables
		sideC = c; //initialize instance variables

	}

	public void calcPerimeter( ) // helper method
	{
		perimeter = sideA + sideB + sideC; // calculates perimeter
	}

	public void calcArea( ) // helper method
	{
		double s; // local variable
		s = perimeter/2; // divides perimeter by 2 and sets that value into s;
		theArea = Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC)); // calculates area
	}

	public void print( ) // print method
	{
		System.out.println("\nPerimeter: "); // prints perimeter
		System.out.println("\nArea: "); // prints area
	}
}