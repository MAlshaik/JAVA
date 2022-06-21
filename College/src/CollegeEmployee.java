import java.util.*;
public class CollegeEmployee extends Person
{
    private String ssn;
    private double annualSalary;
    private String dept;
    Scanner input = new Scanner(System.in);
    @Override
    public void setData()
    {
        super.setData();
        System.out.print("Enter SSN: ");
        ssn = input.nextLine();
        System.out.print("Enter Salary: ");
        annualSalary= input.nextDouble();
        input.nextLine();
        System.out.print("Department: ");
        dept = input.nextLine();
    }
    @Override
    public void display()
    {
        super.display();
        System.out.println("SSN: " + ssn + " Slalary $" + annualSalary + " Department: " + dept);
    }
}
