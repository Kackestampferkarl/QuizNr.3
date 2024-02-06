package Nick;
import java.util.List;
import java.util.Scanner;

public class Quiz {                         //klasse Quiz
    private int score = 0;                  //Punktezaehler der bei null ist.
    private List<Question> questions;       //Frage wird angezeigt
    //Fragen werden in einem zweidimensionalen String-Array gespeichert. Muessen die fragen von einer andren klasse importiert?

    private int currentQuestion;
    Question dasIstEineFrage = new Question(1, List.of(""), "Das ist eine Frage", 10);


    public Quiz(int score, List<Question> questions, int currentQuestion, Question dasIstEineFrage) {
        this.score = score;
        this.questions = questions;
        this.currentQuestion = currentQuestion;
        this.dasIstEineFrage = dasIstEineFrage;
    }

    public void StartQuiz(){
        System.out.println("starte Quiz");

        //Ausgabe von Fragen in der Konsole
        for(int i=0; i < questions.length; i++) {
            System.out.println(questions.toString());           //Frage
            System.out.println(questions[i][1]);                //Antwortmoeglichkeit
            System.out.println(questions[i][2]);                //Antwortmoeglichkeit
            System.out.println(questions[i][3]);                //Antwortmoeglichkeit
            System.out.println(questions[i][4]);                //Antwortmoeglichkeit
            System.out.println("Bitte Antwort eingeben: ");     //Eingabe vom Nutzer
        }

        public Question getNextQuestion() {
            if (Question < (liste[i][]) {
                // Wenn es weitere Fragen gibt, gib die nächste Frage zurück und erhöhe den Index
                return (Question(liste[i][]))
            } else {
                // Wenn es keine weiteren Fragen gibt, gib null zurück oder handle es entsprechend
                return null;
            }
        }

        public int submitAnswer(): boolean;{           //keine ahnung was hier rein soll

        }

        public void increaseScore(): void;{             //keine ahnung ob reicht
            for (int i = 0; i < liste.length; i++)
        }
    }
}
