package mgp_2;

import java.util.ArrayList;
import java.util.Collections;


// TODO: 31.03.2022  hmmmmmmmmmmmmmmmm
public class CountSquare {

    static ArrayList<Integer> line_1 = new ArrayList<Integer>();
    static ArrayList<Integer> line_2 = new ArrayList<Integer>();
    static ArrayList<Integer> line_3 = new ArrayList<Integer>();
    static ArrayList<Integer> line_4 = new ArrayList<Integer>();
    static ArrayList<Integer> line_5 = new ArrayList<Integer>();
    static ArrayList<Integer> line_6 = new ArrayList<Integer>();
    static ArrayList<Integer> line_7 = new ArrayList<Integer>();
    static ArrayList<Integer> line_8 = new ArrayList<Integer>();
    static ArrayList<Integer> line_9 = new ArrayList<Integer>();
    static ArrayList<Integer> line_10 = new ArrayList<Integer>();
    static ArrayList<Integer> line_11 = new ArrayList<Integer>();
    static ArrayList<Integer> line_12 = new ArrayList<Integer>();
    static ArrayList<Integer> line_13 = new ArrayList<Integer>();
    static ArrayList<Integer> line_14 = new ArrayList<Integer>();
    static ArrayList<Integer> line_15 = new ArrayList<Integer>();
    static ArrayList<Integer> line_16 = new ArrayList<Integer>();


    public static void addLineSquare() {
        line_1.add(RandomNumber.randomNumber());
        line_2.add(RandomNumber.randomNumber());
        line_3.add(RandomNumber.randomNumber());
        line_4.add(RandomNumber.randomNumber());
        line_5.add(RandomNumber.randomNumber());
        line_6.add(RandomNumber.randomNumber());
        line_7.add(RandomNumber.randomNumber());
        line_8.add(RandomNumber.randomNumber());
        line_9.add(RandomNumber.randomNumber());
        line_10.add(RandomNumber.randomNumber());
        line_11.add(RandomNumber.randomNumber());
        line_12.add(RandomNumber.randomNumber());
        line_13.add(RandomNumber.randomNumber());
        line_14.add(RandomNumber.randomNumber());
        line_15.add(RandomNumber.randomNumber());
        line_16.add(RandomNumber.randomNumber());
    }

    public static void printListSquare(){
        addLineSquare();
        //System.out.println(line_1.size());

        System.out.print("line_1 : ");
        System.out.println(line_1.get(0));

        System.out.print("line_2 : ");
        System.out.println(line_2.get(0));

        System.out.print("line_3 : ");
        System.out.println(line_3.get(0));

        System.out.print("line_4 : ");
        System.out.println(line_4.get(0));

        System.out.print("line_5 : ");
        System.out.println(line_5.get(0));

        System.out.print("line_6 : ");
        System.out.println(line_6.get(0));

        System.out.print("line_7 : ");
        System.out.println(line_7.get(0));

        System.out.print("line_8 : ");
        System.out.println(line_8.get(0));

        System.out.print("line_9 : ");
        System.out.println(line_9.get(0));

        System.out.print("line_10 : ");
        System.out.println(line_10.get(0));

        System.out.print("line_11 : ");
        System.out.println(line_11.get(0));

        System.out.print("line_12 : ");
        System.out.println(line_12.get(0));

        System.out.print("line_13 : ");
        System.out.println(line_13.get(0));

        System.out.print("line_14 : ");
        System.out.println(line_14.get(0));

        System.out.print("line_15 : ");
        System.out.println(line_15.get(0));

        System.out.print("line_16 : ");
        System.out.println(line_16.get(0));
    }


    //координаты x
    // 60,90,120,150,180,210,240,270,300,330,360,390,420,450,480,510
    static ArrayList<Integer> xSquare = new ArrayList<Integer>();


    //X
    public static void addXSquarePosition() {
        int x = 60;
        for (int i = 0; i < 16; i++) {
            xSquare.add(x);
            x += 30;
          //  System.out.println(xSquare.get(i));
        }

        //перемешать позиции
        Collections.shuffle(xSquare);

        System.out.println(xSquare);
    }


    //вызываем квадратики - кол-во / позиции
    public static void getSquare() {
        CountSquare.printListSquare();
        CountSquare.addLineSquare();
        CountSquare.addXSquarePosition();
    }
}
