package com.company.SimpleCalculations;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Introduce height");
        double height = Double.parseDouble(scanner.nextLine());


        System.out.printf("Introduce sides");

        double sides = Double.parseDouble(scanner.nextLine());

        double area = sides*height/2;



        System.out.printf("Triangle area = %.2f",area);
    }
}
