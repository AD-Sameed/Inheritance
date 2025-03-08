import java.util.Scanner;
public class ChargeAccountChecker {
    public static void main(String[] args) {
        int[] validAccounts = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850,8080152, 4562555, 5552012, 5050552, 7825877, 1250255,1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        boolean isValid = false;
        for (int num : validAccounts) {
            if (num == accountNumber) {
                isValid = true;
                break;
            }
        }
        if (isValid) {
            System.out.println("Valid account number.");
        } else {
            System.out.println("Invalid account number. Please try again.");
        }
        scanner.close();
    }
}
