package com.company.SimpleCalculations;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double currency = Double.parseDouble(scanner.nextLine());
        String inside = scanner.nextLine();
        String out = scanner.nextLine();
        double result;

        if (inside.equalsIgnoreCase("usd")){
            if (out.equalsIgnoreCase("bgn")) {
                result = currency * 1.79549;
                System.out.printf("%.2f %s",result,out);
            }
        }

        if (inside.equalsIgnoreCase("bgn")){
            if (out.equalsIgnoreCase("usd")) {
                result = currency / 1.79549;
                System.out.printf("%.2f %s",result,out);
            }
        }

        if (inside.equalsIgnoreCase("bgn")){
            if (out.equalsIgnoreCase("eur")) {
                result = currency / 1.95583;
                System.out.printf("%.2f %s",result,out);
            }
        }

        if (inside.equalsIgnoreCase("eur")){
            if (out.equalsIgnoreCase("bgn")) {
                result = currency * 1.95583;
                System.out.printf("%.2f %s",result,out);
            }
        }
        if (inside.equalsIgnoreCase("bgn")){
            if (out.equalsIgnoreCase("gbp")) {
                result = currency / 2.53405;
                System.out.printf("%.2f %s",result,out);
            }
        }
        if (inside.equalsIgnoreCase("gbp")){
            if (out.equalsIgnoreCase("bgn")) {
                result = currency * 2.53405;
                System.out.printf("%.2f %s",result,out);
            }
        }

        if (inside.equalsIgnoreCase("eur")){
            if (out.equalsIgnoreCase("gbp")) {
                result = currency * 0.771659919;
                System.out.printf("%.2f %s",result,out);

            }
        }

        if (inside.equalsIgnoreCase("usd")){
            if (out.equalsIgnoreCase("eur")) {
                result = currency * 0.917991354;
                System.out.printf("%.2f %s",result,out);

            }
        }

        if (inside.equalsIgnoreCase("gbp")){
            if (out.equalsIgnoreCase("usd")) {
                result = currency * 1.411336032;
                System.out.printf("%.2f %s",result,out);

            }
        }








    }
}
