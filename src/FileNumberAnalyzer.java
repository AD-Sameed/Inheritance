import java.io.*;
import java.util.*;

public class FileNumberAnalyzer {
    private int[] numbers;
    
    public FileNumberAnalyzer(String fileName) throws IOException {
        List<Integer> numberList = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextInt()) {
                numberList.add(fileScanner.nextInt());
            }
        }
        
        numbers = numberList.stream().mapToInt(i -> i).toArray();
    }
    
    public int getLowest() {
        return Arrays.stream(numbers).min().orElse(Integer.MIN_VALUE);
    }
    
    public int getHighest() {
        return Arrays.stream(numbers).max().orElse(Integer.MAX_VALUE);
    }
    
    public int getTotal() {
        return Arrays.stream(numbers).sum();
    }
    
    public double getAverage() {
        return numbers.length > 0 ? (double) getTotal() / numbers.length : 0;
    }
    
    public void displayResults() {
        System.out.println("Lowest Number: " + getLowest());
        System.out.println("Highest Number: " + getHighest());
        System.out.println("Total: " + getTotal());
        System.out.println("Average: " + getAverage());
    }
    
    public static void main(String[] args) {
        try {
            FileNumberAnalyzer analyzer = new FileNumberAnalyzer("numbers.txt");
            analyzer.displayResults();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
