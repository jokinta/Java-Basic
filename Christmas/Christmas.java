package Podgotovka;

import java.util.Scanner;

public class Christmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        int points = 0;


        while (true) {
            String type = scanner.nextLine();
            if (type.equals("Stop")) {
                System.out.printf("Money left: %d", budget);
                break;
            }


            for (int i = 0; i < type.length(); i++) {
                points += (int)type.charAt(0) - '0';
               // System.out.println(points);
            }
            budget -= points;
            if (points > budget) {
                System.out.println("Not enough money!");
                break;

            } else {
                System.out.println("Item successfully purchased!");
            }
        }


    }
}