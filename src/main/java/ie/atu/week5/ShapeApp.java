package ie.atu.week5;

import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {
        System.out.println("Please Enter the length of the rectangle");
        Scanner input = new Scanner(System.in);
        double length = input.nextDouble();
        Rectangle shapeRect = new Rectangle();
        shapeRect.setLength(length);
        System.out.println("You entered :" + shapeRect.getLength());

        System.out.println("Please Enter the width of the rectangle");
        double width = input.nextDouble();
        shapeRect.setWidth(width);
        System.out.println("You entered :" + shapeRect.getWidth());




        System.out.println("Please Enter the length of the rectangle 2");
        double length2 = input.nextDouble();
        Rectangle shapeRect2 = new Rectangle();
        shapeRect2.setLength(length2);
        System.out.println("You entered :" + shapeRect2.getLength());

        System.out.println("Please Enter the width of the rectangle 2");
        double width2 = input.nextDouble();
        shapeRect2.setWidth(width2);
        System.out.println("You entered :" + shapeRect2.getWidth());

        Rectangle shapeRect3 = new Rectangle(23,67);
        System.out.println("Length:" + shapeRect3.getLength());
        System.out.println("Width:" + shapeRect3.getWidth());


    }
}
