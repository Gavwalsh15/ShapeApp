package ie.atu.week5;

import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {
        System.out.println("Please Enter the lenght of the rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        System.out.println("You entered :"+ length);

        System.out.println("Please Enter the width of the rectangle");
        double width = input.nextDouble();
        System.out.println("You entered :"+ width);
    }
}
