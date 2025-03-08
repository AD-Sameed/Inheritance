import java.util.Random;
import java.util.Scanner;

public class Lottery {
    private int[] lotteryNumbers = new int[5];

    public Lottery() {
        Random rand = new Random();
        for (int i = 0; i < lotteryNumbers.length; i++) {
            lotteryNumbers[i] = rand.nextInt(10); // Generates numbers 0-9
        }
    }

    public int compareNumbers(int[] userNumbers) {
        int matchCount = 0;
        for (int i = 0; i < lotteryNumbers.length; i++) {
            if (lotteryNumbers[i] == userNumbers[i]) {
                matchCount++;
            }
        }
        return matchCount;
    }

    public int[] getLotteryNumbers() {
        return lotteryNumbers.clone();
    }

    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        Scanner scanner = new Scanner(System.in);
        int[] userNumbers = new int[5];

        System.out.println("Enter your 5 lottery numbers (0-9):");
        for (int i = 0; i < userNumbers.length; i++) {
            userNumbers[i] = scanner.nextInt();
        }
        scanner.close();

        int matches = lottery.compareNumbers(userNumbers);

        System.out.println("Lottery Numbers: ");
        for (int num : lottery.getLotteryNumbers()) {
            System.out.print(num + " ");
        }
        System.out.println("\nYour Numbers: ");
        for (int num : userNumbers) {
            System.out.print(num + " ");
        }
        System.out.println("\nMatching digits: " + matches);

        if (matches == 5) {
            System.out.println("Congratulations! You are the grand prize winner!");
        } else {
            System.out.println("Better luck next time!");
        }
    }
}
