import java.util.ArrayList;
import java.util.Scanner;

class Question {
    private String question;
    private String[] options;
    private int correctAnswer;
    
    public Question(String question, String option1, String option2, String option3, String option4, int correctAnswer) {
        this.question = question;
        this.options = new String[]{option1, option2, option3, option4};
        this.correctAnswer = correctAnswer;
    }
    
    public String getQuestion() {
        return question;
    }
    
    public String[] getOptions() {
        return options;
    }
    
    public int getCorrectAnswer() {
        return correctAnswer;
    }
}

public class TriviaGame {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("What is the capital of Pakistan?", "Lahore", "Islamabad", "Karachi", "Faisalabad", 2));
        questions.add(new Question("What is the currency of Pakistan?", "Yen", "Won", "Dollar", "Paisa", 4));
        questions.add(new Question("What is the tallest mountain in the world?", "K2", "Everest", "Kilimanjaro", "Denali", 2));
        
        Scanner scanner = new Scanner(System.in);
        int player1Score = 0, player2Score = 0;
        
        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("Question " + (i + 1) + ": " + q.getQuestion());
            String[] options = q.getOptions();
            for (int j = 0; j < options.length; j++) {
                System.out.println((j + 1) + ". " + options[j]);
            }
            System.out.print("Enter your answer (1-4): ");
            int answer = scanner.nextInt();
            
            if (answer == q.getCorrectAnswer()) {
                if (i < 5) {
                    player1Score++;
                } else {
                    player2Score++;
                }
            }
        }
        scanner.close();
        
        System.out.println("\nPlayer 1 Score: " + player1Score);
        System.out.println("Player 2 Score: " + player2Score);
        
        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
