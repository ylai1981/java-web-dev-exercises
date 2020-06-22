package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        Scanner input;
        int miles;
        int gallons;
        int mpg;

        input = new Scanner(System.in);
        System.out.println("Enter number of miles traveled: ");
        miles = input.nextInt();
        System.out.println("Enter amount of gas in gallon consumed: ");
        gallons = input.nextInt();

        mpg = miles/gallons;
        System.out.println("Your miles-per-gallon is: " + mpg);


    }
}
