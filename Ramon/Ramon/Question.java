import java.util.List;

public class Question {
    private int correctOption;
    private List<String> options;//TODO may move into own class
    private String questionText;
    private int questionTimer;

    public Question(int correctOption, List<String> options, String questionText, int questionTimer) {
        this.correctOption = correctOption;
        this.options = options;
        this.questionText = questionText;
        this.questionTimer = questionTimer;
    }

    public int getCorrectOption() {
        return correctOption;
    }

    public void setCorrectOption(int correctOption) {
        this.correctOption = correctOption;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public int getQuestionTimer() {
        return questionTimer;
    }

    public void setQuestionTimer(int questionTimer) {
        this.questionTimer = questionTimer;
    }

    public boolean checkAnswer(){
        return false; // TODO: 26.01.2024 have to implement
    }

    @Override
    public String toString() {
        return "Question{" +
                "correctOption=" + correctOption +
                ", options=" + options +
                ", questionText='" + questionText + '\'' +
                ", questionTimer=" + questionTimer +
                '}';
    }
}