import java.util.Scanner;
public class GradeBook {
    private String[] studentNames = new String[5];
    private char[] letterGrades = new char[5];
    private double[][] testScores = new double[5][4];

    public void inputStudentData() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter student " + (i + 1) + " name: ");
            studentNames[i] = scanner.nextLine();
            
            for (int j = 0; j < 4; j++) {
                double score;
                do {
                    System.out.print("Enter test score " + (j + 1) + " for " + studentNames[i] + ": ");
                    score = scanner.nextDouble();
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score! Please enter a value between 0 and 100.");
                    }
                } while (score < 0 || score > 100);
                testScores[i][j] = score;
            }
            scanner.nextLine(); // Consume newline
            letterGrades[i] = calculateLetterGrade(getAverageScore(i));
        }
        scanner.close();
    }
    public double getAverageScore(int index) {
        double sum = 0;
        for (double score : testScores[index]) {
            sum += score;
        }
        return sum / testScores[index].length;
    }
    public char calculateLetterGrade(double avg) {
        if (avg >= 90) return 'A';
        else if (avg >= 80) return 'B';
        else if (avg >= 70) return 'C';
        else if (avg >= 60) return 'D';
        else return 'F';
    }
    public void displayStudentGrades() {
        System.out.println("\nStudent Grades:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Student: " + studentNames[i] + " | Average Score: " + getAverageScore(i) + " | Grade: " + letterGrades[i]);
        }
    }
    public static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();
        gradeBook.inputStudentData();
        gradeBook.displayStudentGrades();
    }
}
