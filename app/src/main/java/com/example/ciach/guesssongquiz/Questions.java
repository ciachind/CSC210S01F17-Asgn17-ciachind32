package com.example.ciach.guesssongquiz;


public class Questions {

    public String mQuestions[] = {
            "Name this song!"
    };

    private String mChoices[][] = {
            {"Time", "Satisfaction", "KnockOut", "Thriller"}

    };

    private String mCorrectAnswer[] = {
            "KnockOut"
    };

    public String getQuestion(int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswer[a];
        return answer;
    }
}
