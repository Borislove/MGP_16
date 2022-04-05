package test_generator;

import java.util.Arrays;

public class TestGen4 {

    //first
    static int arrayNumber[] = new int[17];

    //second
    static {
        addNumber();
    }

    //добавление чисел в массив
    private static void addNumber() {
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = randomNumber();
        }
    }

    //печать
    private static void printLineRandomNumber() {
        for (int i = 1; i < arrayNumber.length; i++) {
            System.out.println("line_" + i + " : " + arrayNumber[i]);
        }
    }

    //генерация чисел
    private static int randomNumber() {
        return ((int) (Math.random() * 16 + 1));   //клетку 0 делать?
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayNumber));

      //  System.out.println(arrayNumber[1]);

        printLineRandomNumber();
    }
}
