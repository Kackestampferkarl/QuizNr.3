package Nick;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private int score;
    private List<Question> questions;
    private int currentQuestion;

    public Quiz(List<Question> questions) {
        this.score = 0;
        this.questions = questions;
        this.currentQuestion = 0;
    }

    public void startQuiz() {
        System.out.println("Starte Quiz");

        for (int i = 0; i < questions.size(); i++) {
            Question currentQuestion = questions.get(i);

            System.out.println(currentQuestion.getQuestionText());
            List<String> options = currentQuestion.getOptions();
            for (String option : options) {
                System.out.println(option);
            }

            System.out.print("Bitte Antwort eingeben: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.nextLine();

            if (currentQuestion.isCorrectAnswer(userAnswer)) {
                increaseScore();
            }
        }
    }

    public void increaseScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}
