package com.company.SimpleCalculations;

import java.util.Scanner;

public class RadiansToDegrees {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double rad = Double.parseDouble(scanner.nextLine());


        double deg = rad * 57.2958;


        System.out.print(Math.round(deg));
    }
}
