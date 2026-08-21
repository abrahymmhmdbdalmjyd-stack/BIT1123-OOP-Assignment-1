public class Questions {

    private String question;
    private String option1;
    private String option2;
    private String answer;

    public Questions(String question, String option1, String option2, String answer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public boolean isCorrect(String choice) {
        return choice.equals(answer);
    }
}