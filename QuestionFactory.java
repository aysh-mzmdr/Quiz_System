public class QuestionFactory extends Question{
    Question[] questions=new Question[10];
    static int size;
    static{
        size=0;
    }

    private void pushBack(String question,String[] options,char answer){
        questions[size++]=new Question(question,options,answer);
    }

    QuestionFactory(){
        pushBack(
            "What is the capital of India?",
            new String[]{"Kolkata","Mumbai","New Delhi","Lucknow"},
            'C'
        );

        pushBack(
            "What is the capital of Japan?",
            new String[]{"Toyko","Kasukabe","Nagasaki","Hiroshima"},
            'A'
        );
    }


}
