import java.util.Scanner;
public class Alternate {
    public static String getAlternateChars(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 2) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String result = getAlternateChars(input);
        System.out.println("Alternate characters: " + result);
    }
}
