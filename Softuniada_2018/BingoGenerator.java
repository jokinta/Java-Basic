package com.company.Softuniada_2018;

import java.util.Scanner;

public class BingoGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        String first = "";
        String second = "";
        String newnumberString = "";
        String Dividing12 = "";
        String Dividing15 = "";
        int Diving12counter = 0;
        int Diving15counter = 0;

        for (int j = 0; j < number.length(); j += 2) {
            first += number.charAt(j);
        }
        for (int i = 1; i < number.length(); i += 2) {
            second += number.charAt(i);

        }

        newnumberString += first.charAt(0);
        newnumberString += first.charAt(1);
        newnumberString += second.charAt(0);
        newnumberString += second.charAt(1);

        int firstnumber = Integer.parseInt(first);
        int secondnumber = Integer.parseInt(second);
        int newnumber = Integer.parseInt(newnumberString);
        int tavan = firstnumber + secondnumber;


        int counter = 0;

        while (true) {
            int enternumber = newnumber++;
            String enternumberString = "";
            enternumberString += enternumber;
            String enterfirst = "";
            String entersecond = "";
            for (int j = 0; j < 2; j++) {
                enterfirst += enternumberString.charAt(j);
            }
            for (int i = 2; i < 4; i++) {
                entersecond += enternumberString.charAt(i);
            }

            int firstint = Integer.parseInt(enterfirst);
            int secondint = Integer.parseInt(entersecond);
            int razlika = tavan - secondint;

            if (secondint == tavan) {
                newnumber +=(100-15);
            }


            if (firstint <= tavan && secondint <= tavan) {

                if (enternumber % 12 == 0) {
                    Dividing12 += enternumber;
                    Dividing12 += ' ';
                    Diving12counter++;
                } else if (enternumber % 15 == 0) {
                    Dividing15 += enternumber;
                    Dividing15 += ' ';
                    Diving15counter++;

                }
            }


            if (firstint > tavan) {
                break;
            }
        }

        System.out.printf("Dividing on 12: %s%n", Dividing12);
        System.out.printf("Dividing on 15: %s%n", Dividing15);
        if (Diving12counter == Diving15counter) {
            System.out.println("!!!BINGO!!!");
        } else {
            System.out.println("NO BINGO!");
        }

    }
}
