public class Question implements Questionable{
    private String question;
    private String[] options;
    private char answer;

    public Question(String question,String[] options,char answer){
        setQuestion(question,options,answer);
    }

    public Question(){

    }

    @Override
    public void getQuestion(){
        System.out.println(this.question);
        char optionValue='A';
        for(String option:this.options){
            System.out.println(optionValue+") "+option);
            optionValue++;
        }
        System.out.print("\nAns:");
    }

    @Override
    public boolean isCorrect(char answer) {
        if(answer==this.answer)
            return true;
        return false;
    }

    @Override
    public void setQuestion(String question, String[] options,char answer) {
        this.question=question;
        this.options=options;
        this.answer=answer;
    }

}