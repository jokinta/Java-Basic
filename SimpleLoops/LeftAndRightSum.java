package com.company.SimpleLoops;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftsum = 0;
        int rightsum =0;

        for (int i = 0;i < n;i++){
            int currentNumber = Integer.parseInt(scanner.nextLine());
            leftsum += currentNumber;

        }
        for (int j=0;j<n;j++){
            int currentNumver = Integer.parseInt(scanner.nextLine());
            rightsum += currentNumver;
        }
        if (leftsum==rightsum){
            System.out.printf("Yes, sum = %d",leftsum);
        }else
            System.out.printf("No, diff = %d",Math.abs(leftsum-rightsum));

    }
}
