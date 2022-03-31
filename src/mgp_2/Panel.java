package mgp_2;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {

    static int test_position = 60;

   /* public static void test_2() {

        for (int i = 0; i < CountSquare.xSquare.size(); i++) {
            test_position = CountSquare.line_1.get(i);
            System.out.println("test_position: " + CountSquare.xSquare.get(i));
        }
    }*/


    public void paint(Graphics g) {

        int lenghtLineX = 540;
        int lenghtLineY = 525;
        int distanceX = 15;
        int distanceY = 15;

        int test = 30;
        int number = 37;

        //количество линий
        int horizontalLine = 18;
        int verticaltalLine = 18;


        ////////////////LINE////////////////////////////////////
        //horizontal LINE
        for (int i = 0; i < horizontalLine; i++) {
            g.drawLine(lenghtLineX, distanceX, 30, distanceX);
            //  g.drawString(""+i, distanceX,distanceX); //diagonal
            distanceX += 30;
        }

        //vertical LINE
        for (int i = 0; i < verticaltalLine; i++) {
            g.drawLine(test, distanceY, test, lenghtLineY);
            test += 30;
        }
        /////////////////////////////////////////////////////////

        ///////////NUMBERS//////////////////////////
        g.setFont(new Font("Arial", 30, 20));

        //vertical num
        g.drawString("" + 1, 70, number);
        g.drawString("" + 2, 100, number);
        g.drawString("" + 3, 130, number);
        g.drawString("" + 4, 160, number);
        g.drawString("" + 5, 190, number);
        g.drawString("" + 6, 220, number);
        g.drawString("" + 7, 250, number);
        g.drawString("" + 8, 280, number);
        g.drawString("" + 9, 310, number);

        g.drawString("" + 10, 335, number);
        g.drawString("" + 11, 365, number);
        g.drawString("" + 12, 395, number);
        g.drawString("" + 13, 425, number);
        g.drawString("" + 14, 455, number);
        g.drawString("" + 15, 485, number);
        g.drawString("" + 16, 515, number);

        number += 3;
        //vertical num
        g.drawString("" + 1, number, 70);
        g.drawString("" + 2, number, 100);
        g.drawString("" + 3, number, 130);
        g.drawString("" + 4, number, 160);
        g.drawString("" + 5, number, 190);
        g.drawString("" + 6, number, 220);
        g.drawString("" + 7, number, 250);
        g.drawString("" + 8, number, 280);
        g.drawString("" + 9, number, 305);

        number = 35;
        g.drawString("" + 10, number, 335);
        g.drawString("" + 11, number, 365);
        g.drawString("" + 12, number, 395);
        g.drawString("" + 13, number, 425);
        g.drawString("" + 14, number, 455);
        g.drawString("" + 15, number, 485);
        g.drawString("" + 16, number, 515);
        ///////////////////////////////////////////////


        //Заполнение квадратов

        //line 1   //кол-во + позиция

        //проверка координат - разница в 30
        // g.fillRect(60, 45, 30, 30); //1
        //g.fillRect(90, 45, 30, 30); //2
        //g.fillRect(120, 45, 30, 30); //3
        //g.fillRect(150, 45, 30, 30); //4
        //g.fillRect(180, 45, 30, 30); //5
        //g.fillRect(210, 45, 30, 30); //6
        //g.fillRect(240, 45, 30, 30); //7
        //g.fillRect(270, 45, 30, 30); //8
        //g.fillRect(300, 45, 30, 30); //9
        //g.fillRect(330, 45, 30, 30); //10
        //g.fillRect(360, 45, 30, 30); //11
        // g.fillRect(390, 45, 30, 30); //12
        // g.fillRect(420, 45, 30, 30); //13
        // g.fillRect(450, 45, 30, 30); //14
        //g.fillRect(480, 45, 30, 30); //15
        //  g.fillRect(510, 45, 30, 30); //16

        //60,90,120,150,180,210,240,270,300,330,360,390,420,450,480,510


        //первый закрашенный квадрат
        //g.fillRect(60,45,30,30);


        //g.fillRect(CountSquare.xSquare.get(0), 45, 30, 30);

        /*for (int i = CountSquare.line_1.size(); i < CountSquare.xSquare.size() ; i++) {
            g.fillRect(CountSquare.xSquare.get(i), 45, 30, 30);
        }
    }*/

        //размер рандомного числа
   /*     for (int i = 0; i < CountSquare.line_1.size(); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 45, 30, 30);
            i++;
            g.fillRect(CountSquare.xSquare.get(i), 45, 30, 30);
            i++;
            g.fillRect(CountSquare.xSquare.get(i), 45, 30, 30);
        }*/

        /*g.fillRect(CountSquare.xSquare.get(0), 45, 30, 30);
        g.fillRect(CountSquare.xSquare.get(1), 45, 30, 30);
        g.fillRect(CountSquare.xSquare.get(2), 45, 30, 30);*/


        // line 1
        for (int i = 0; i < CountSquare.line_1.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 45, 30, 30);
        }

        // line 2    - 75
        for (int i = 0; i < CountSquare.line_2.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 75, 30, 30);
        }

        // line 3    - 105
        for (int i = 0; i < CountSquare.line_3.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 105, 30, 30);
        }

        // line 4    - 135
        for (int i = 0; i < CountSquare.line_4.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 135, 30, 30);
        }

        //line 5    - 165
        for (int i = 0; i < CountSquare.line_5.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 165, 30, 30);
        }

        //line 6    - 195
        for (int i = 0; i < CountSquare.line_6.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 195, 30, 30);
        }

        //line 7    - 225
        for (int i = 0; i < CountSquare.line_7.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 225, 30, 30);
        }

        //line 8    - 255
        for (int i = 0; i < CountSquare.line_8.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 255, 30, 30);
        }

        //line 9    - 285
        for (int i = 0; i < CountSquare.line_9.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 285, 30, 30);
        }

        //line 10    - 315
        for (int i = 0; i < CountSquare.line_10.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 315, 30, 30);
        }

        //line 11    - 345
        for (int i = 0; i < CountSquare.line_11.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 345, 30, 30);
        }

        //line 12    - 375
        for (int i = 0; i < CountSquare.line_12.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 375, 30, 30);
        }

        //line 13    - 405
        for (int i = 0; i < CountSquare.line_13.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 405, 30, 30);
        }

        //line 14    - 435
        for (int i = 0; i < CountSquare.line_14.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 435, 30, 30);
        }

        //line 15    - 465
        for (int i = 0; i < CountSquare.line_15.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 465, 30, 30);
        }

        //line 16    - 495
        for (int i = 0; i < CountSquare.line_16.get(0); i++) {
            g.fillRect(CountSquare.xSquare.get(i), 495, 30, 30);
        }
    }
}

