package com.company.DrawingFiguresWithLoops;

import java.util.Scanner;

public class SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        System.out.print("+ ");
        for (int i = 0; i <n-2; i++) {
            System.out.print("- ");

        }
        System.out.println("+ ");
        for (int k = 0; k < n-2; k++) {
            System.out.print("| ");


            for (int j = 0; j < n - 2; j++) {
                System.out.print("- ");

            }
            System.out.println("| ");
        }
        System.out.print("+ ");
        for (int l = 0; l <n-2; l++) {
            System.out.print("- ");

        }
        System.out.println("+ ");

    }
}
