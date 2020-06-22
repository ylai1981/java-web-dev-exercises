package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner input;
        double length;
        double width;
        double area;

        input = new Scanner(System.in);
        System.out.println("Enter the length in inches: ");
        length = input.nextDouble();
        System.out.println("Enter the width in inches: ");
        width = input.nextDouble();

        area = length * width;
        System.out.println("The area is " + area + " inches");



    }

}
