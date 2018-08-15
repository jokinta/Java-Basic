package com.company.SimpleCalculations;

import java.util.Scanner;

public class RectangleArea {
    public static class Main {
        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            double x1 = Double.parseDouble(scanner.nextLine());
            double y1 = Double.parseDouble(scanner.nextLine());
            double x2 = Double.parseDouble(scanner.nextLine());
            double y2 = Double.parseDouble(scanner.nextLine());

            double width = Math.max(x1, x2) - Math.min(x1, x2);
            double high = Math.max(y1, y2) - Math.min(y1, y2);

            double plost = width * high;
            double perimeter = width * 2 + high * 2;

            System.out.printf("%f%n%f%n", plost, perimeter);
        }
    }
}
