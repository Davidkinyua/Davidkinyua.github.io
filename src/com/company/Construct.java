package com.company;

import javax.swing.*;
import java.awt.*;

public class Construct extends JPanel {

    /** Program that displays a flower in a window. */

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);  // paint background

        Graphics2D g2 = (Graphics2D) g;
        //RGB values for the walls of the house
        int rand = (int)(Math.random() * 200);
        int red = (int)(Math.random() * 255);
        int green = (int)(Math.random() * 255);
        int blue = (int)(Math.random() * 255);
        //RGB values for the roof
        int red1 = (int)(Math.random() * 255);
        int green1 = (int)(Math.random() * 255);
        int blue1 = (int)(Math.random() * 255);
        //The length and the width of the house
        int widthHouse = 120 + rand;
        int heightHouse = 140 + rand;


        g.drawString("The width of the house is "+ widthHouse +" pixels", 450, 20);
        g.drawString("The height of the house is "+ heightHouse +" pixels", 450, 30);
        g.drawString("the color of the roof is red "+red1+" green "+green1+" blue "+blue1, 450, 40);
        g.drawRect(50, 290 + rand, 600 + rand, 125 + rand); //garden area

        g.setColor(new Color(red, green, blue));
        g.fillRect(50, 150, widthHouse, heightHouse); // The walls, floor and roof of the house

        g.setColor(new Color(red1, green1, blue1));//.color of the roof
        //The roof of the house
        int x[] = {20, 110 + rand/2, 200 + rand}; // x-coordinates of the roof
        int u[] = {150, 110, 150}; // y-coordinates of the roof
        int n = 3; //number of vertices
        g.fillPolygon(x, u, n);


        int i;
        for (i=0; i<7; i++){
            int j = 90 * i; //distance between flowers
            // Draw the stem.
            g2.setStroke(new BasicStroke(10, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2.setColor(new Color(0, 128, 0));  // green
            g2.drawLine(100 + j, 400 + rand, 100 + j, 330 + rand);

            //Decide the color of the flower
            double m = Math.random();
            double p = 1.0/6.0;
            double o = 2.0/6.0;
            double l = 3.0/6.0;
            double k = 4.0/6.0;
            double y = 5.0/6.0;
            double h = 1.0;
            int re, gr, bl;
            //red
            if(m>=0 && m<p){
                re = 255;
                gr = 0;
                bl = 0;
                g2.setColor(new Color(re, gr, bl));
                System.out.println(re + gr + bl);
                //orange
            }else if(m>=p && m<o){
                re = 255;
                gr = 165;
                bl = 0;
                g2.setColor(new Color(re, gr, bl));
                System.out.println(re + gr + bl);
                //yellow
            }else if(m>=o && m<l){
                re = 255;
                gr = 255;
                bl = 0;
                g2.setColor(new Color(re, gr, bl));
                System.out.println(re + gr + bl);
                //blue
            }else if(m>=l && m<k){
                re = 0;
                gr = 0;
                bl = 255;
                g2.setColor(new Color(re, gr, bl));
                System.out.println(re + gr + bl);
                //purple
            }else if(m>=k && m<y){
                re = 238;
                gr = 130;
                bl = 238;
                g2.setColor(new Color(re, gr, bl));
                System.out.println(re + gr + bl);
                //black
            }else if(m>=y && m<h){
                re = 0;
                gr = 0;
                bl = 0;
                g2.setColor(new Color(re, gr, bl));
                System.out.println(re + gr + bl);
            }
            // Draw the center.
            //g2.setColor(new Color(re, gr, bl));  // orange
            g2.fillOval(75 + j, 305 + rand, 50, 50);

            // Draw eight petals at N, NE, E, SE, S, SW, W, NW positions on the center.
            int petalWidth = 20;
            int petalHeight = 20;
            //g2.setColor(new Color(re, gr, bl));  // pink
            g2.fillOval(90 + j, 295 + rand, petalWidth, petalHeight);
            g2.fillOval(90 + j, 345 + rand, petalWidth, petalHeight);
            g2.fillOval(64 + j, 320 + rand, petalWidth, petalHeight);
            g2.fillOval(115 + j, 320 + rand, petalWidth, petalHeight);
            g2.fillOval(108 + j, 338 + rand, petalWidth, petalHeight);
            g2.fillOval(108 + j, 302 + rand, petalWidth, petalHeight);
            g2.fillOval(72 + j, 338 + rand, petalWidth, petalHeight);
            g2.fillOval(72 + j, 302 + rand, petalWidth, petalHeight);
        }
    }

}

