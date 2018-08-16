package com.company.SimpleConditionalStatements;

import java.util.Scanner;

public class ExcellentOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rating = Double.parseDouble(scanner.nextLine());

        if (rating >= 5.50) {
            System.out.println("Excellent!");

        }
        else{
            System.out.println("Not excellent.");
        }

    }
}
