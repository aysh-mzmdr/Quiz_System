import java.util.Scanner;

public class Main{
    static int score;
    Main(){
        score=0;
    }

    public static void updateScore(){
        score+=100;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ans='A';
        QuestionFactory factory=new QuestionFactory();
        for(int i=0;i<QuestionFactory.size;i++){
            factory.questions[i].getQuestion();
            ans=sc.next().charAt(0);
            if(factory.questions[i].isCorrect(ans))
                updateScore();
        }    
        System.out.println("Score: "+score);
        sc.close();   
    }
}