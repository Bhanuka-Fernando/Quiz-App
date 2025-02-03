public class QuestionService {

    Question[]  questions = new Question[5];

    public QuestionService(){
        questions[0] = new Question(1,"What is your name","Bhanuka", "bhanuka","ruvindi","Thenuka","janendra");
        questions[1] = new Question(1,"What is your pet","dog", "bhanuka","dog","Thenuka","janendra");
        questions[2] = new Question(1,"What is your car","bmw", "bmw","ruvindi","Thenuka","janendra");
        questions[3] = new Question(1,"What is your bike","hornet", "hornet","ruvindi","Thenuka","janendra");
        questions[4] = new Question(1,"What is your cab","rocco", "rocco","ruvindi","Thenuka","janendra");
    }

    public void displayQuestions(){
        for(Question q:questions){
            System.out.println(q.toString());
        }

    }

}
