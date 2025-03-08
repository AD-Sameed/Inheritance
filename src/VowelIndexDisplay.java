import java.util.Scanner;
public class VowelIndexDisplay {
    public static void display(String str) {
        String vowels = "AEIOUaeiou";
        int first = -1, last = -1;
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        if (first != -1) {
            System.out.println("First vowel position: " + first);
            System.out.println("Last vowel position: " + last);
        } else {
            System.out.println("No vowels found in the string.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        display(input);
    }
}
