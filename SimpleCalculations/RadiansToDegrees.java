package com.company.SimpleCalculations;

import java.util.Scanner;

public class RadiansToDegrees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double radian = Double.parseDouble(scanner.nextLine());


        double degrees = radian * 57.2958;


        System.out.print(Math.round(degrees)) ;


                                    

    }
}
