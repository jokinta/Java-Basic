package com.company.Softuniada_2018;

import java.util.Scanner;

public class EasterEgg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int width = n * 5;
        int height = 2 * n + 3;
        String first = "";
        String middle = "";


        for (int i = 0; i < (width - n) / 2; i++) {
            first += '.';
        }
        for (int j = 0; j < n; j++) {
            first += '*';

        }
        for (int i = 0; i < (width - n) / 2; i++) {
            first += '.';
        }

        System.out.println(first);


        int point = (n *2) - 2;
        int star = 1;
        int plus = width-(point*2+star*2);
        for (int i = 0; i < n / 2; i++) {
            String second = "";

            for (int j = 0; j < point; j++) {
                second += '.';
            }
            for (int k = 0; k < star; k++) {
                second += '*';
            }
            for (int l = 0; l < plus; l++) {
                second += '+';
            }
            for (int k = 0; k < star; k++) {
                second += '*';
            }
            for (int j = 0; j < point; j++) {
                second += '.';
            }
            point -= 2;
            star++;
            plus += 2;

            System.out.println(second);

        }
        int point2=n - 1;
        int equally=(width-((n-1)*2+4));
        int point5=1;
        for (int i = 0; i < n / 2; i++) {
            String third = "";
            for (int j = 0; j < point2; j++) {
                third += '.';
            }
            for (int k = 0; k < 2; k++) {
                third += '*';
            }
            for (int m = 0; m <equally; m++) {
                third+='=';
            }
            for (int k = 0; k < 2; k++) {
                third += '*';
            }
            for (int j = 0; j < point2; j++) {
                third += '.';
            }
            point2--;
            equally+=2;
            point5++;
            System.out.println(third);
        }

        for (int i = 0; i <n/2 ; i++) {
            middle+='.';
        }
        middle+="**";
        for (int m = 0; m <(width-(16+(n/2)*2))/2 ; m++) {
            middle+='~';

        }
        middle+="HAPPY EASTER";
        for (int m = 0; m <(width-(16+(n/2)*2))/2 ; m++) {
            middle+='~';

        }
        middle+="**";
        for (int i = 0; i <n/2 ; i++) {
            middle+='.';
        }
        System.out.println(middle);

        int point3 = n/2;
        int equally2 = width-(point3*2+4);

        for (int i = 0; i < n / 2; i++) {
            String third = "";
            for (int j = 0; j < point3; j++) {
                third += '.';
            }
            for (int k = 0; k < 2; k++) {
                third += '*';
            }
            for (int m = 0; m <equally2; m++) {
                third+='=';
            }
            for (int k = 0; k < 2; k++) {
                third += '*';
            }
            for (int j = 0; j < point3; j++) {
                third += '.';
            }
            point3++;
            equally2-=2;
            System.out.println(third);
        }
        int point4 = n;
        int star2 = n/2;
        int plus2 = width-(point4*2+star2*2);
        for (int i = 0; i < n / 2; i++) {
            String second = "";

            for (int j = 0; j < point4; j++) {
                second += '.';
            }
            for (int k = 0; k < star2; k++) {
                second += '*';
            }
            for (int l = 0; l < plus2; l++) {
                second += '+';
            }
            for (int k = 0; k < star2; k++) {
                second += '*';
            }
            for (int j = 0; j < point4; j++) {
                second += '.';
            }
            point4 += 2;
            star2--;
            plus2 -= 2;
            System.out.println(second);

        }
        System.out.println(first);
    }
}
