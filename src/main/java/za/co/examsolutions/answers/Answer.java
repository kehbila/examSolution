package za.co.examsolutions.answers;

public class Answer {
    private String answer;
    private boolean correct;

 
    public boolean isCorrect() {
        return correct;
    }


    public String getAnswer() {
        return answer;
    }


    public void setAnswer(String answer) {
        this.answer = answer;
    }


    public void isCorrect(boolean correct) {
        this.correct = correct;
    }

}