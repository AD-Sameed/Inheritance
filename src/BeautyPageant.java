import java.util.Scanner;
public class BeautyPageant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = 5;
        int J = 3;
        double[] Score = new double[C];
        double total_score = 0;
        for (int i = 0; i < C; i++) {
            System.out.println("Enter scores for Contestant"+(i + 1)+":");
            double total = 0;
            for (int j = 0; j < J; j++) {
                System.out.print("Judge " + (j + 1) + ": ");
                total += scanner.nextDouble();
            }
            Score[i] = total;
            total_score += total;
        }
        System.out.println("Total scores of each contestant:");
        for (int i = 0; i < C; i++) {
            System.out.println("Contestant " + (i + 1) + ": " + Score[i]);
        }
        System.out.println("Average score of all contestants: " + (total_score / C));
        scanner.close();
    }
}
