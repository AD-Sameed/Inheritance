import java.util.Scanner;

public class Password {
    public static boolean isValidPassword(String password) { 
        return password.length() >= 6 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*\\d.*");     
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String userPassword = scanner.nextLine();
        System.out.println("Password must meet the following criteria:");
        System.out.println("✔ At least 6 characters long");
        System.out.println("✔ At least one uppercase letter");
        System.out.println("✔ At least one lowercase letter");
        System.out.println("✔ At least one digit");

        if (isValidPassword(userPassword)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Invalid password. Make sure it meets all criteria.");
        }

    }
}
