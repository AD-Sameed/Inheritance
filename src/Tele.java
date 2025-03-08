import java.util.Scanner;

public class Tele {
    public static void main(String[] args) {
        String[] names = {
            "Hassan, Akhtar", "Ahsan, Akhtar"
        };

        String[] phoneNumbers = {
            "555-2234", "555-9098"
            };

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("\nEnter a name or starting characters to search (or type 'exit' to quit): ");
            String search = scanner.nextLine().toLowerCase();

            if (search.equals("exit")) {
                System.out.println("Exiting...");
                break;
            }

            boolean found = false;
            System.out.println("\nMatching Results:");
            for (int i = 0; i < names.length; i++) {
                if (names[i].toLowerCase().startsWith(search)) {
                    System.out.println(names[i] + ": " + phoneNumbers[i]);
                    found = true;
                }
            }

            if (!found) {
                System.out.println("No matches found.");
            }
        }

        scanner.close();
    }
}
