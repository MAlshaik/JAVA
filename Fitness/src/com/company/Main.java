package com.company;
import javafx.fxml.FXML;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    @FXML
    private Label lblStatus;

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("Fitness.txt");
        Scanner scanner = new Scanner(file);

        int[] week;
        String[] thur;

        double thursday1;
        double thursday2;

         r = () -> System.out.println("hello");


        while (scanner.hasNextLine()) {
            thur = scanner.nextLine().split(":"); // a colon is simpler.
            if (thur[0].equalsIgnoreCase("Thursday")) {
                thursday1 = Double.parseDouble(thur[1]);
                System.out.println(thursday1);
            }
        }
            scanner.close();


        }

    }