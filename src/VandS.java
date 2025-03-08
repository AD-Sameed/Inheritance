import java.util.Scanner;
public class VandS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VandS prob4;

        while (true) {
            System.out.print("Enter a string: ");
            prob4 = new VandS(scanner.nextLine());
            
            while (true) {
                System.out.println("\nMenu:");
                System.out.println("a. Count vowels");
                System.out.println("b. Count consonants");
                System.out.println("c. Count both");
                System.out.println("d. Enter another string");
                System.out.println("e. Exit");
                System.out.print("Choose an option: ");
                
                char choice = scanner.next().charAt(0);
                scanner.nextLine();
                
                if (choice == 'a') System.out.println("Vowels: " + prob4.vovel());
                else if (choice == 'b') System.out.println("Consonants: " + prob4.consonant());
                else if (choice == 'c') System.out.println("Total: " + (prob4.vovel() + prob4.consonant()));
                else if (choice == 'd') break;
                else if (choice == 'e') {
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                } else System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
