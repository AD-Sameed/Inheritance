public class TwoDArrayOperations {
    
    public static int getTotal(int[][] array) {
        int total = 0;
        for (int[] row : array) {
            for (int num : row) {
                total += num;
            }
        }
        return total;
    }
    
    public static double getAverage(int[][] array) {
        int totalElements = 0;
        int total = getTotal(array);
        for (int[] row : array) {
            totalElements += row.length;
        }
        return (double) total / totalElements;
    }
    
    public static int getRowTotal(int[][] array, int rowIndex) {
        int total = 0;
        for (int num : array[rowIndex]) {
            total += num;
        }
        return total;
    }
    
    public static int getColumnTotal(int[][] array, int colIndex) {
        int total = 0;
        for (int[] row : array) {
            if (colIndex < row.length) {
                total += row[colIndex];
            }
        }
        return total;
    }
    
    public static int getHighestInRow(int[][] array, int rowIndex) {
        int highest = array[rowIndex][0];
        for (int num : array[rowIndex]) {
            if (num > highest) {
                highest = num;
            }
        }
        return highest;
    }
    
    public static int getLowestInRow(int[][] array, int rowIndex) {
        int lowest = array[rowIndex][0];
        for (int num : array[rowIndex]) {
            if (num < lowest) {
                lowest = num;
            }
        }
        return lowest;
    }
    
    public static void main(String[] args) {
        int[][] testData = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        System.out.println("Total: " + getTotal(testData));
        System.out.println("Average: " + getAverage(testData));
        System.out.println("Row 1 Total: " + getRowTotal(testData, 1));
        System.out.println("Column 2 Total: " + getColumnTotal(testData, 2));
        System.out.println("Highest in Row 0: " + getHighestInRow(testData, 0));
        System.out.println("Lowest in Row 2: " + getLowestInRow(testData, 2));
    }
}
