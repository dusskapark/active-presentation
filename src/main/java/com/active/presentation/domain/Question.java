package com.active.presentation.domain;

import javax.persistence.*;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 6/13/14
 */
@Entity
public class Question {

    @Id
    @GeneratedValue
    private Long id;

    private String answerList;

    public Question() {}

    public Question(String answerList) {
        this.answerList = answerList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswerList() {
        return answerList;
    }

    public void setAnswerList(String answerList) {
        this.answerList = answerList;
    }


    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", answerList='" + answerList + '\'' +
                '}';
    }
}
