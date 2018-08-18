package com.company.Softuniada_2018;

import java.util.Scanner;

public class AwesomeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caracter = 0;
        int number = scanner.nextInt();
        int favoritenumber = scanner.nextInt();

        if (number%2!=0){
            caracter++;

        }
        if(number%favoritenumber==0){
            caracter++;
        }
        if(number<0){
            caracter++;
        }

        if(caracter==3){
            System.out.println("super special awesome");
        }else if(caracter==2){
            System.out.println("super awesome");
        }else if(caracter==1){
            System.out.println("awesome");
        }else if(caracter==0){
            System.out.println("boring");
        }
    }
}
