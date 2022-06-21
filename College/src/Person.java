import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
public class Person
{
    private String firstName;
    private String lastName;
    public String address;
    private String zip;
    private String phone;
    Scanner input = new Scanner(System.in);
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public void setData()
    {

        System.out.println("Enter First Name:");
        if(input.hasNextLine())
        firstName = input.nextLine();
        System.out.println("Enter Last Name:");
        lastName = input.nextLine();
        System.out.println("Enter Address:");
        address = input.nextLine();
        System.out.println("Enter zip:");
        zip = input.nextLine();
        System.out.println("Enter Phone Number:");
        phone = input.nextLine();

    }
    public void display()
    {
        System.out.println(firstName + " " + lastName + " " + address + " " + zip + " " + phone);
    }
}
