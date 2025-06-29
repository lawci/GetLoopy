import java.util.Random;
import java.util.Scanner;

public class DieRollar {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        String playAgain;

        do {
            System.out.println("Roll\tDie1\tDie2\tDie3\tSum");
            System.out.println("----------------------------------");
            int rollCount = 0;
            boolean isTriple = false;

            while (!isTriple) {
                rollCount++;
                int die1 = rand.nextInt(6) + 1;
                int die2 = rand.nextInt(6) + 1;
                int die3 = rand.nextInt(6) + 1;
                int sum = die1 + die2 + die3;
                System.out.printf("%d\t%d\t%d\t%d\t%d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    isTriple = true;
                    System.out.println("Triple! All dice show " + die1);
                }
            }

            System.out.print("Play again? (Y/N): ");
            playAgain = in.nextLine().toUpperCase();
        } while (playAgain.equals("Y"));
    }
}