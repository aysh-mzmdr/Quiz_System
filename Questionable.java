public interface Questionable {
    void getQuestion();
    boolean isCorrect(char answer);
    void setQuestion(String question,String[] options,char answer);
}