package test_generator;

import java.util.Arrays;

///////lol
public class TestGen2 {

    //need line 16 - > random number

    static int line_1 = (int) (Math.random() * 16 + 1);
    static int line_2 = (int) (Math.random() * 16 + 1);
    static int line_3 = (int) (Math.random() * 16 + 1);
    static int line_4 = (int) (Math.random() * 16 + 1);
    static int line_5 = (int) (Math.random() * 16 + 1);
    static int line_6 = (int) (Math.random() * 16 + 1);
    static int line_7 = (int) (Math.random() * 16 + 1);
    static int line_8 = (int) (Math.random() * 16 + 1);
    static int line_9 = (int) (Math.random() * 16 + 1);
    static int line_10 = (int) (Math.random() * 16 + 1);
    static int line_11 = (int) (Math.random() * 16 + 1);
    static int line_12 = (int) (Math.random() * 16 + 1);
    static int line_13 = (int) (Math.random() * 16 + 1);
    static int line_14 = (int) (Math.random() * 16 + 1);
    static int line_15 = (int) (Math.random() * 16 + 1);
    static int line_16 = (int) (Math.random() * 16 + 1);

    static int lineList[] = new int[16];
    static String lineName[] = new String[16];

    //создать имя переменной
    public static void creatNameVariable() {
        String str = "line_";
        for (int i = 0; i < lineName.length; i++) {
            lineName[i] = str + i;
        }
    }

    //создать массив с именем переменной
    public static void addArrayLine() {
        //ADD LINE LIST NUMBER
        for (int i = 0; i < lineList.length; i++) {
           // lineList[i] = lineName[i];
        }
    }


    public static void printLineRandomNumber() {
        for (int i = 1; i < 17; i++) {
            System.out.println("line " + i + " " + line_1);
        }
    }


    public static void main(String[] args) {

        //  lineList[0] = line_1;

        //addArrayLine();

        //System.out.println(Arrays.toString(lineList));
        // System.out.print("all line: ");
        //  System.out.println(lineList.length);

        //TestGen2.printLineRandomNumber();

        //returnVariable();
        //   System.out.println(returnVariable());

        creatNameVariable();
        addArrayLine();

        System.out.println(Arrays.toString(lineName));

        System.out.println(Arrays.toString(lineList));
    }
}
