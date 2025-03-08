import java.util.Scanner;

public class NumbersinString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter numbers separated by commas: ");
        String input = scanner.nextLine();

        String[] numbers = input.split(",");
        int sum = 0;

        for (String num : numbers) {
            sum += Integer.parseInt(num.trim());
        }

        System.out.println("Sum of numbers: " + sum);

        scanner.close();
    }
}
