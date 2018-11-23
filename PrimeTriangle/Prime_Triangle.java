import java.util.Scanner;

public class Prime_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String row ="";
        for (int i = 1; i <= n; i++) {
            int maxDivider = (int)Math.sqrt(i);
            boolean isPrime = true;
            for (int divider = 2; divider <= maxDivider; divider++) {
                if (i % divider == 0) {
                    isPrime = false;

                }

            }
            if (isPrime) {
                row += "1";
                System.out.println(row);

            } else {
                row+="0";

            }

        }

    }
}