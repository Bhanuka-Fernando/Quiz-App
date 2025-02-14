import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];
    String[] selection = new String[5];

    public QuestionService() {
        questions[0] = new Question(1, "What is your name ?", "Bhanuka", "bhanuka", "ruvindi", "Thenuka", "janendra");
        questions[1] = new Question(2, "What is your pet ?", "dog", "bhanuka", "dog", "Thenuka", "janendra");
        questions[2] = new Question(3, "What is your car ?", "bmw", "bmw", "ruvindi", "Thenuka", "janendra");
        questions[3] = new Question(4, "What is your bike ?", "hornet", "hornet", "ruvindi", "Thenuka", "janendra");
        questions[4] = new Question(5, "What is your cab ?", "rocco", "rocco", "ruvindi", "Thenuka", "janendra");
    }

    public void playQuiz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];

            // Display the question
            System.out.println("Q" + (i + 1) + ": " + que.getQuestion());
            System.out.println("A) " + que.getOpt1());
            System.out.println("B) " + que.getOpt2());
            System.out.println("C) " + que.getOpt3());
            System.out.println("D) " + que.getOpt4());

            // Get user input
            System.out.print("Your answer: ");
            selection[i] = sc.nextLine().trim();  // Store the answer
        }

        sc.close();
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if (actualAnswer.equalsIgnoreCase(userAnswer)) { // Case-insensitive comparison
                score++;
            }
        }
        System.out.println("Your score: " + score + "/" + questions.length);
    }
}
