import java.util.Arrays;

public class code {
    public static void main(String[] args) {
        String str = "abcdef";

        for (int rep = 0; rep < str.length() - 1; rep++)

        {

            System.out.print(str.substring(rep, rep + 2));

        }
    }
    public static void conditionalTest(int a, int b) {

        if ((a > 0) && (b > 0))

        {

            if (a > b)

                System.out.println("A");

            else

                System.out.println("B");

        }

        else if ((b < 0) || (a < 0))

            System.out.println("C");

        else

            System.out.println("D");

    }
}
