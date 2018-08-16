package com.company.SimpleConditionalStatements;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int scorr = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if (scorr < 100) {
            bonus = 5;
        } else if (scorr < 1000) {
            bonus = scorr * 0.2;
        } else {
            bonus = scorr * 0.1;
        }

        if (scorr % 2 == 0) {
            bonus = bonus + 1;
        }

        if (scorr % 10 == 5) {
            bonus = bonus + 2;
        }

        System.out.println(bonus);
        System.out.println(bonus + scorr);
    }
}
