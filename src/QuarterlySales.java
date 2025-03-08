import java.util.Scanner;

public class QuarterlySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int divisions = 6, quarters = 4;
        double[][] sales = new double[divisions][quarters];
        
        // Input sales figures
        for (int i = 0; i < divisions; i++) {
            for (int j = 0; j < quarters; j++) {
                do {
                    System.out.print("Enter sales for Division " + (i + 1) + ", Quarter " + (j + 1) + ": ");
                    sales[i][j] = scanner.nextDouble();
                    if (sales[i][j] < 0) {
                        System.out.println("Sales cannot be negative. Please enter again.");
                    }
                } while (sales[i][j] < 0);
            }
        }
        
        // Display statistics
        for (int j = 0; j < quarters; j++) {
            System.out.println("\nQuarter " + (j + 1) + " Statistics:");
            double totalSales = 0, highestSales = 0;
            int highestDivision = 0;
            
            for (int i = 0; i < divisions; i++) {
                System.out.println("Division " + (i + 1) + " Sales: " + sales[i][j]);
                totalSales += sales[i][j];
                if (sales[i][j] > highestSales) {
                    highestSales = sales[i][j];
                    highestDivision = i + 1;
                }
            }
            
            System.out.println("Total Sales: " + totalSales);
            System.out.println("Average Sales: " + (totalSales / divisions));
            System.out.println("Highest Sales: Division " + highestDivision + " with " + highestSales);
            
            if (j > 0) {
                double companyChange = totalSales - getTotalSales(sales, j - 1);
                System.out.println("Company Sales Change from Last Quarter: " + companyChange);
                
                for (int i = 0; i < divisions; i++) {
                    double change = sales[i][j] - sales[i][j - 1];
                    System.out.println("Division " + (i + 1) + " Sales Change: " + change);
                }
            }
        }
        scanner.close();
    }
    
    public static double getTotalSales(double[][] sales, int quarter) {
        double total = 0;
        for (double[] division : sales) {
            total += division[quarter];
        }
        return total;
    }
}
