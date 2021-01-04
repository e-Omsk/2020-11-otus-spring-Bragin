package ru.otus.spring.domain;

import java.util.Map;

public class  Questions {

    private final String question;
    private final Map<Integer, String> answer;
    private final int trueAnswer;

    public Questions(String question, Map<Integer, String> answer, int trueAnswer) {
        this.question = question;
        this.answer = answer;
        this.trueAnswer = trueAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public Map<Integer, String> getAnswer() {
        return answer;
    }

    public int getTrueAnswer() {
        return trueAnswer;
    }
}
