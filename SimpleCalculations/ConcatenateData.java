package com.company.SimpleCalculations;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String lastname = scanner.nextLine();
        int year = Integer.parseInt(scanner.nextLine());
        String city = scanner.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", name, lastname, year, city);
    }
}
