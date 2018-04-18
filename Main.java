package com.company;
import java.awt.Color;
import java.awt.Graphics;

// This program uses DrawingPanel and Graphics to draw a few
//shapes that looks like a mouse.

public class Main {

    public static void main(String[] args) {
//        creates drawing panel 600 x 600 pixels
        DrawingPanel p = new DrawingPanel(600, 600);

//        gets the graphics for the various shapes
        Graphics g = p.getGraphics();

//        sets the different colors and draws the shapes
        g.setColor(Color.yellow);
        g.fillRect(10, 10, 580, 580);
        g.setColor(Color.BLUE);
        g.fillOval(150, 150, 100, 100);
        g.fillOval(350, 150, 100, 100);
        g.setColor(Color.RED);
        g.fillRect(200, 200, 200, 200);
        g.setColor(Color.BLACK);
        g.drawLine(200, 300, 400, 300);
    }
}
