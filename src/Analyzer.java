import java.util.Scanner;
class Analyzer {
    private String text;

    public Analyzer(String text) {
        this.text = text.toLowerCase();
    }

    public int countVowels() {
        int count = 0;
        String vowels = "aeiou";
        for (char ch : text.toCharArray()) {
            if (vowels.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public int countConsonants() {
        int count = 0;
        String vowels = "aeiou";
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch) && vowels.indexOf(ch) == -1) {
                count++;
            }
        }
        return count;
    }

    public int countBoth() {
        return countVowels() + countConsonants();
    }

    public void setText(String text) {
        this.text = text.toLowerCase();
    }
}

public class Analyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringAnalyzer analyzer = null;
        boolean running = true;

        while (running) {
            if (analyzer == null) {
                System.out.print("Enter a string: ");
                analyzer = new Analyzer(scanner.nextLine());
            }

            System.out.println("\nMenu:");
            System.out.println("a. Count the number of vowels in the string");
            System.out.println("b. Count the number of consonants in the string");
            System.out.println("c. Count both the vowels and consonants in the string");
            System.out.println("d. Enter another string");
            System.out.println("e. Exit the program");
            System.out.print("Choose an option: ");

            char choice = scanner.next().charAt(0);
            scanner.nextLine(); 

            switch (choice) {
                case 'a':
                    System.out.println("Number of vowels: " + analyzer.countVowels());
                    break;
                case 'b':
                    System.out.println("Number of consonants: " + analyzer.countConsonants());
                    break;
                case 'c':
                    System.out.println("Total vowels and consonants: " + analyzer.countBoth());
                    break;
                case 'd':
                    System.out.print("Enter a new string: ");
                    analyzer.setText(scanner.nextLine());
                    break;
                case 'e':
                    running = false;
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
    }
}
