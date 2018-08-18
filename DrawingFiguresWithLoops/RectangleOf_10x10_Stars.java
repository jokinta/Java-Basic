package com.company.DrawingFiguresWithLoops;

import java.util.Scanner;

public class RectangleOf_10x10_Stars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }
}

