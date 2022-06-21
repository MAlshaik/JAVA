/*
Write a fully commented Circle class that has the following fields:
 
Class Variables:
PI: a final double initialized with the value 3.14159
radius: a double

The Circle class should have the following methods:

Constructor: A default constructor that sets the radius field to 0.0.
Constructor: accepts the radius of the circle as an argument.

setRadius: A mutator method for the radius field.
getRadius: An accessor method for the radius field.

getArea: Returns the area of the circle which is calculated as: area = PI  X radius X radius

getDiameter: Returns the diameter of the circle which is calculated as diameter = radius X 2

getCircumference: Returns the circumference of the circle, which is calculated as circumference= 2 X PI X radius

Write a program that demonstrates the Circle class by asking the user for the circle's radius, 
creating a Circle object, and then reporting the circle's area, diameter, and circumference.

NOTE: This is well commented code - practice adding it on all your programs.

*/

import java.util.Scanner;

public class CircleRunner{

	public static void main(String[] args) {

    	// Create a Scanner object for keyboard input.
    	Scanner input = new Scanner(System.in);

    	// Ask user to input circle radius
    	System.out.print("Enter the radius of a circle: ");
    	double radius = input.nextDouble();

    	// Create a Circle object passing in user input
    	Circle circle = new Circle();
    	circle.setRadius(radius);

    	// Display circle information -  - use dot notation
    	System.out.println("\nArea is " + circle.getArea());
    	System.out.println("Diameter is " + circle.getDiameter());
    	System.out.println("Circumference is " + circle.getCircumference());

		// Let's do it again - create another circle!
		System.out.print("\n\nEnter the radius of a new circle: ");
		double radius2 = input.nextDouble();

		// Remember to set the radius for the new circle
		Circle circle2 = new Circle();
		circle2.setRadius(radius2);
		
		
		// Display 2nd circle information - use dot notation
    	System.out.println("\nArea is " + circle2.getArea());
    	System.out.println("Diameter is " + circle2.getDiameter());
    	System.out.println("Circumference is " + circle2.getCircumference());

	}
}
