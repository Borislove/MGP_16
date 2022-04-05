package test_generator;

import java.util.Arrays;

//функцию 1 добавление чисел
public class TestGen3 {

    //need line 16 - > random number
    static int line_1 = randomNumber();
    static int line_2 = randomNumber();
    static int line_3 = randomNumber();
    static int line_4 = randomNumber();
    static int line_5 = randomNumber();
    static int line_6 = randomNumber();
    static int line_7 = randomNumber();
    static int line_8 = randomNumber();
    static int line_9 = randomNumber();
    static int line_10 = randomNumber();
    static int line_11 = randomNumber();
    static int line_12 = randomNumber();
    static int line_13 = randomNumber();
    static int line_14 = randomNumber();
    static int line_15 = randomNumber();
    static int line_16 = randomNumber();

    public static int randomNumber() {
        return ((int) (Math.random() * 16 + 1));
    }

    static int lineList[] = new int[16];

    public static void addLineRandomNumber() {
        lineList[0] = line_1;
        lineList[1] = line_2;
        lineList[2] = line_3;
        lineList[3] = line_4;
        lineList[4] = line_5;
        lineList[5] = line_6;
        lineList[6] = line_7;
        lineList[7] = line_8;
        lineList[8] = line_9;
        lineList[9] = line_10;
        lineList[10] = line_11;
        lineList[11] = line_12;
        lineList[12] = line_13;
        lineList[13] = line_14;
        lineList[14] = line_15;
        lineList[15] = line_16;
    }


    public static void main(String[] args) {

        addLineRandomNumber();
        System.out.println(Arrays.toString(lineList));
        System.out.println(lineList[0]);
    }
}


