package mgp_2;

import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel {


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

    }
}

