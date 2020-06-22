package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;
import java.lang.*;

public class Area {
    public static void main(String[] args){
        double radius = 0;
        double area;
        boolean error = false;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Enter a radius: ");
            try{
                radius = input.nextDouble();
            }
            catch (Exception e) {
                error = true;
                break;
            }
        }while(radius < 0) ;

        input.close();

        if(error){
            System.out.println("Please enter a number!");
        }
            area = Circle.getArea(radius);
            System.out.println("The area of the circle with a radius of " + radius + " is: " + area);



    }
}
