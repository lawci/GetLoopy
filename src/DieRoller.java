import java.util.Scanner;
import java.util.Random;

public class DieRoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random gen = new Random();
        String playAgain;

        do {
            System.out.printf("%-10s%-10s%-10s%-10s%-10s%n", "Roll", "Die1", "Die2", "Die3", "Sum");
            System.out.println("----------------------------------------------------------");

            int rollCount = 0;
            boolean tripleFound = false;

            while (!tripleFound) {
                rollCount++;
                int die1 = gen.nextInt(6) + 1;
                int die2 = gen.nextInt(6) + 1;
                int die3 = gen.nextInt(6) + 1;
                int sum = die1 + die2 + die3;

                System.out.printf("%-10d%-10d%-10d%-10d%-10d%n", rollCount, die1, die2, die3, sum);

                if (die1 == die2 && die2 == die3) {
                    tripleFound = true;
                }
            }

            System.out.print("\nRoll again? (Y/N): ");
            playAgain = in.nextLine();

        } while (playAgain.equalsIgnoreCase("Y"));

        System.out.println("Thanks for playing!");
    }
}