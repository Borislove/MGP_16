package mgp_1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;

public class Panel extends JPanel {

    int sizeX = 511;
    int sizeY = 495;
    int distanceX = 15;
    int distanceY = 15;

    int test = 30;

    int horizontalLine = 17;
    int verticaltalLine = 17;

    ArrayList<Integer> lineOne = new ArrayList<Integer>();


    public void paint(java.awt.Graphics g) {

        lineOne.add(90);
        lineOne.add(30);
        lineOne.add(150);
        lineOne.add(210);
        lineOne.add(270);
        lineOne.add(330);
        lineOne.add(450);


        Collections.shuffle(lineOne);


        g = (Graphics2D) g;
        g.setColor(Color.black);
        //first line horizontal
        //g.drawLine(sizeX, distance, 30, distance);

        //16 line horizontal

        for (int i = 0; i < horizontalLine; i++) {
            g.drawLine(sizeX, distanceX, 30, distanceX);


            //   g.fillRect(30, 15, 30, 30);

            distanceX += 30;
        }
        //lol
      /*  g.setColor(Color.red);
        for (int i = 0; i < verticaltalLine; i++) {
            g.drawLine(sizeX, 0, 30, distance);
            distance += 30;
        }*/

//        g.setColor(Color.red);

        for (int i = 0; i < verticaltalLine; i++) {
            g.drawLine(test, distanceY, test, sizeY);
/*
            g.fillRect(90,15,30,30);
            g.fillRect(150,15,30,30);
            g.fillRect(210,15,30,30);
            g.fillRect(270,15,30,30);
            g.fillRect(330,15,30,30);
            g.fillRect(390,15,30,30);
            g.fillRect(450,15,30,30);*/

            //g.fillRect(list.get(0), 15, 30, 30);
            //g.fillRect(30, 15, 30, 30);
            test += 30;
        }


        //x , y
      /*  g.fillRect(lineOne.get(0), 45, 30, 30);
        g.fillRect(lineOne.get(1), 15, 30, 30);
        g.fillRect(lineOne.get(2), 75, 30, 30);
        g.fillRect(lineOne.get(3), 105, 30, 30);
        g.fillRect(lineOne.get(4), 135, 30, 30);
        g.fillRect(lineOne.get(5), 165, 30, 30);
        g.fillRect(lineOne.get(6), 195, 30, 30);*/


      //////////////////////////////////////////////////////////////////////
        Collections.shuffle(lineOne);

        for (int i = 0; i < 6 ; i++) {

            for (int j = 0; j < 6 ; j++) {

            }
            Collections.shuffle(lineOne);
            g.fillRect(lineOne.get(0), 45, 30, 30);
            Collections.shuffle(lineOne);
            g.fillRect(lineOne.get(0), 15, 30, 30);
            Collections.shuffle(lineOne);
            g.fillRect(lineOne.get(0), 75, 30, 30);
            Collections.shuffle(lineOne);
            g.fillRect(lineOne.get(0), 105, 30, 30);
            Collections.shuffle(lineOne);
            g.fillRect(lineOne.get(0), 135, 30, 30);
            Collections.shuffle(lineOne);
            g.fillRect(lineOne.get(0), 165, 30, 30);
            Collections.shuffle(lineOne);
            g.fillRect(lineOne.get(0), 195, 30, 30);
            g.fillRect(lineOne.get(0), 225, 30, 30);
        }

      //////////////////////////////////////////////////////////////////////
     /*   g.fillRect(lineOne.get(0), 45, 30, 30);
        g.fillRect(lineOne.get(1), 15, 30, 30);
        g.fillRect(lineOne.get(2), 75, 30, 30);
        g.fillRect(lineOne.get(3), 105, 30, 30);
        g.fillRect(lineOne.get(4), 135, 30, 30);
        g.fillRect(lineOne.get(5), 165, 30, 30);
        g.fillRect(lineOne.get(6), 195, 30, 30);

        Collections.shuffle(lineOne);

        g.fillRect(lineOne.get(0), 45, 30, 30);
        g.fillRect(lineOne.get(1), 15, 30, 30);
        g.fillRect(lineOne.get(2), 75, 30, 30);
        g.fillRect(lineOne.get(3), 105, 30, 30);
        g.fillRect(lineOne.get(4), 135, 30, 30);
        g.fillRect(lineOne.get(5), 165, 30, 30);
        g.fillRect(lineOne.get(6), 195, 30, 30);
     //   g.fillRect(lineOne.get(7), 225, 30, 30);*/


    }
}
