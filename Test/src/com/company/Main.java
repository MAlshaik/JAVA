package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

public class Main extends JPanel  {

    public void paint(Graphics yes){
        this.setBackground(Color.WHITE);
        this.setForeground(Color.BLACK);
        yes.setColor(Color.BLACK);
        yes.fillRect(300, 200, 50,50);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("YES");
        Main window = new Main();
        frame.add(window);
        frame.setSize(1280, 720);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);




    }
}


