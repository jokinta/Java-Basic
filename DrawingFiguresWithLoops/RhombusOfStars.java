package com.company.DrawingFiguresWithLoops;

import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < n; row++) {


            for (int i = 1; i < n - row; i++) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (int columns = 0; columns < row; columns++) {
                System.out.print(" *");

            }

            System.out.println();
        }
        for (int columns = 0; columns < n - 1; columns++) {

            for (int columns1 = 0; columns1 < columns1 + 1; columns1++) {
                System.out.print(" ");
            }

            System.out.print("*");
            for (int columns1 = 0; columns1 < n - columns1 - 2; columns1++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
