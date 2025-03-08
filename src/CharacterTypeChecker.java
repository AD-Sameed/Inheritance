import java.util.Scanner;
public class CharacterTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
        if (Character.isDigit(input)) {
            System.out.println("The character is a digit.");
        } else if (Character.isLetter(input)) {
            System.out.println("The character is an alphabet.");
        } else {
            System.out.println("The character is a special character.");
        }
        scanner.close();
    }
}
