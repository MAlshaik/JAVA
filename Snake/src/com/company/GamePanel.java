package com.company;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JFrame implements Runnable {
    private static final long serialVersionUID = 1L;
    public static final int WIDTH = 500, HEIGHT = 500;

    public GamePanel(){

        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    public void start(){

    }
    public void stop(){

    }
    public void tick(){

    }
    public void paint(Graphics g) {
        for (int i = 0; i < WIDTH / 10; i++) {
            g.drawLine(i * 10, 0, i * 10, HEIGHT);
        }
        for (int i = 0; i < HEIGHT / 10; i++) {
            g.drawLine(0, i * 10, HEIGHT, i * 10);
        }
    }

    @Override
    public void run() {

    }
}
