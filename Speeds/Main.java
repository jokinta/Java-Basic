import java.util.Scanner;

public class Speeds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int groupSpeed = scanner.nextInt();

        int groupLength = 1;
        int groupSum = groupSpeed;
        int bestLenght = 1;
        int bestSum = groupSpeed;
        for (int i = 0; i < n - 1; i++) {  //n-1 zasto sme vec proceli 1 cislo

            int speed = scanner.nextInt();

            if (groupSpeed < speed) {
                groupLength++;
                groupSum += speed;
            } else {

                groupSpeed = speed;
                groupSum = speed;
                groupLength = 1;

            }
            if (bestLenght < groupLength) {
                bestLenght = groupLength;
                bestSum = groupSum;
            } else if (bestLenght == groupLength) {
                bestSum = Math.max(bestSum, groupSum);
            }
        }
        System.out.println(bestSum);

    }


}