package com.company.SimpleCalculations;

import java.util.Scanner;

public class GreetingByName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        System.out.print("Hello, ");
        System.out.println(ime+"!");
    }
}
