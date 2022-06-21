package com.company;
import javafx.scene.shape.Circle;

import javax.swing.JFrame;
import java.awt.*;

public class Main extends Frame {

    public static void main(String[] args) {
        final int HEIGHT = 800;
        final int WIDTH = 800;
        JFrame frame = new JFrame("flappy");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(HEIGHT,WIDTH);
        frame.setVisible(true);
    }

    public void paint(Graphics g){
        Graphics2D ga = (Graphics2D)g;
        ga.setPaint(Color.BLACK);
        ga.fillOval(150,150,50,50);
    }
}
