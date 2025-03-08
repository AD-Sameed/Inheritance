import java.util.Scanner;
class PasswordVerifier {
    private String password;

    public PasswordVerifier(String password) {
        this.password = password;
    }

    public boolean isValid() {
        return isLongEnough() && hasUppercase() && hasLowercase() && hasDigit();
    }

    private boolean isLongEnough() {
        return password.length() >= 6;
    }

    private boolean hasUppercase() {
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasLowercase() {
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasDigit() {
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }
}

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();
        scanner.close();

        PasswordVerifier verifier = new PasswordVerifier(password);

        if (verifier.isValid()) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid. It must:");
            System.out.println("- Be at least 6 characters long");
            System.out.println("- Contain at least one uppercase letter");
            System.out.println("- Contain at least one lowercase letter");
            System.out.println("- Contain at least one digit");
        }
    }
}
