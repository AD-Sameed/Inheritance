import java.util.Scanner;
public class GroceryBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no.of items: ");
        int item = scanner.nextInt();
        double total = 0;
        while (item-- > 0) {
            System.out.print("Enter price: ");
            total += scanner.nextDouble();
        }
        System.out.println("Total spent:" + total);
        scanner.close();
    }
}
