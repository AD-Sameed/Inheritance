public class ArrayOperations {
    
    public static int getTotal(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }
    
    public static double getAverage(int[] array) {
        return (double) getTotal(array) / array.length;
    }
    
    public static int getHighest(int[] array) {
        int highest = array[0];
        for (int num : array) {
            if (num > highest) {
                highest = num;
            }
        }
        return highest;
    }
    
    public static int getLowest(int[] array) {
        int lowest = array[0];
        for (int num : array) {
            if (num < lowest) {
                lowest = num;
            }
        }
        return lowest;
    }
    
    public static void main(String[] args) {
        int[] testData = {5, 10, 15, 20, 25};
        
        System.out.println("Total: " + getTotal(testData));
        System.out.println("Average: " + getAverage(testData));
        System.out.println("Highest: " + getHighest(testData));
        System.out.println("Lowest: " + getLowest(testData));
    }
}
