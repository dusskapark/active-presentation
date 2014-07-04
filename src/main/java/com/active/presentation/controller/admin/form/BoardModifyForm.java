package com.active.presentation.controller.admin.form;

import com.sun.istack.internal.NotNull;

import java.util.List;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 7/4/14
 */
public class BoardModifyForm {
    @NotNull
    private Long id;
    private String title;
    private boolean secure;
    private boolean status;

    private List<String> questions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isSecure() {
        return secure;
    }

    public void setSecure(boolean secure) {
        this.secure = secure;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    @Override
    public String toString() {
        return "BoardModifyForm{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", secure=" + secure +
                ", status=" + status +
                ", questions=" + questions +
                '}';
    }
}
