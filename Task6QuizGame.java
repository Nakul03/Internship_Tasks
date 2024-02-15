import java.util.Scanner;

public class Task6QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questions and answers array
        String[] questions = {
                "What is the name of biggest Black hole in universe?",
                "Who wrote the book You Can Win?",
                "What is the chemical symbol for water?"
        };
        String[] options = {
                "A) Holmberg 15A    B) TON 618    C) S5 0014+81",
                "A) William Shakespeare    B) Charles Dickens    C) Shiv Khera",
                "A) H2O    B) CO2    C) NaCl"
        };
        String[] answers = {"B", "C", "A"};

        int score = 0;

        // Display questions and get user answers
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            System.out.println(options[i]);
            System.out.print("Enter your answer (A, B, or C): ");
            String userAnswer = scanner.nextLine().toUpperCase();

            // Check if the user's answer is correct
            if (userAnswer.equals(answers[i])) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect! The correct answer is " + answers[i]);
            }
            System.out.println();
        }

        // Display final score
        System.out.println("Quiz completed!");
        System.out.println("Your final score is: " + score + "/" + questions.length);

        scanner.close();
    }
}
