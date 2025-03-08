import java.util.Scanner;

public class Prob14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence with words joined together: ");
        String input = scanner.nextLine();
        
        StringBuilder formattedSentence = new StringBuilder();
        formattedSentence.append(Character.toUpperCase(input.charAt(0))); 

        for (int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                formattedSentence.append(" ").append(Character.toLowerCase(ch));
            } else {
                formattedSentence.append(ch);
            }
        }

        System.out.println("Formatted sentence: " + formattedSentence.toString());
        scanner.close();
    }
}
