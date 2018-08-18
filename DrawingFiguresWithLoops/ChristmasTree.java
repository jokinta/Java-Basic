package com.company.DrawingFiguresWithLoops;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < n+1; row++) {


            String space = repeat(" ",n- row);
            String star = repeat("*",row);
            String finish = space + star + " | " + star + space;
            System.out.println(finish);

        }
    }
    static String repeat(String caracter, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += caracter;
        }
        return text;
    }
}
