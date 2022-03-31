package mgp_2;

public class Main {

    static {
        getName();
        getPackage();
    }

    private static void getName() {
        System.out.println("Class: " + Main.class.getName());
    }

    private static void getPackage() {
        System.out.println("Package: " + Main.class.getPackage());
    }

    public static void main(String[] args) {
       new Window();


       /* for (int i = 0; i <150 ; i++) {
            System.out.println(RandomNumber.randomNumber());
        }*/

       //CountSquare.printListSquare();

       // CountSquare.addXSquarePosition();
    }
}
