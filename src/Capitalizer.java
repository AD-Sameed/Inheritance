import java.util.Scanner;
public class Capitalizer {
    public static String Sentences(String str) {
        String[] sentences = str.split("(?<=[.!?])\\s*");
        StringBuilder result = new StringBuilder();

        for (String sentence : sentences) {
            if (!sentence.isEmpty()) {
                result.append(Character.toUpperCase(sentence.charAt(0)))
                      .append(sentence.substring(1))
                      .append(" ");
            }
        }
        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String result = Sentences(input);
        System.out.println("Capitalized Sentence: " + result);
    }
}
