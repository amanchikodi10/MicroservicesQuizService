package com.quiz.entites;

import jakarta.persistence.*;


public class Answer {

    private int id;

    private int questionId;

    private String answer;

    private boolean istrue;

    public int getId() {
        return id;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public boolean isIstrue() {
        return istrue;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setIstrue(boolean istrue) {
        this.istrue = istrue;
    }

    public Answer(int id, int questionId, boolean istrue, String answer) {
        this.id = id;
        this.questionId = questionId;
        this.istrue = istrue;
        this.answer = answer;
    }

    public Answer() {
        super();
    }
}
