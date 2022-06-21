/* Just as we did with the Triangle Class 
 * add comments to each line to identify
 * it's method type, the code element, 
 * purpose or variable type. Be thorough.
*/

public class Circle {

    private double radius; //Declare instance variable
    private double area; //Declare instance variables

    public Circle() { //default constructor
        setRadius(0); // modifier method call
        radius = 0; //initialize instance variables
        area = 0; //initialize instance variables
    }

    public Circle(double r) { //initialization constructive
        setRadius(r); // modifier method call
        area = 0; //initialize instance variables
    }

    public void setRadius(double r) { // modifier method
      radius = r; //initialize instance variables
    }

    public double getRadius() { // helper method
       return radius; //returns radius
    }

    public double getArea() { // helper method
        area = 2*3.14*Math.pow(radius, 2); //calculates area
       return area; // returns area
    }

    public double getDiameter() { // helper method
      return 2*radius; //calculates and returns diameter
    }

    public double getCircumference() { // helper method
        return 2*3.14*radius; // calculates and returns circumference
    }
}