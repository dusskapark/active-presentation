package com.active.presentation.domain;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 6/11/14
 */
@Entity
//@Table(uniqueConstraints=@UniqueConstraint(columnNames={"dashboard_id", "audience_id"}))
public class Answer {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private PresentationDashboard dashboard;

    @OneToOne
    private Audience audience;

    private Long resultId;
    private String result;
    private String userAgent;
    private Date createdDate = new Date();
    private Date modifyDate = new Date();

    public Answer() {}

    public Answer(PresentationDashboard dashboard, Audience audience, Long resultId, String result, String userAgent) {
        this.dashboard = dashboard;
        this.audience = audience;
        this.resultId = resultId;
        this.result = result;
        this.userAgent = userAgent;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PresentationDashboard getDashboard() {
        return dashboard;
    }

    public void setDashboard(PresentationDashboard dashboard) {
        this.dashboard = dashboard;
    }

    public Audience getAudience() {
        return audience;
    }

    public void setAudience(Audience audience) {
        this.audience = audience;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Long getResultId() {
        return resultId;
    }

    public void setResultId(Long resultId) {
        this.resultId = resultId;
    }

    @Override
    public String toString() {
        return "Answer{" +
                "id=" + id +
                ", dashboard=" + dashboard +
                ", audience=" + audience +
                ", resultId=" + resultId +
                ", result='" + result + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", createdDate=" + createdDate +
                ", modifyDate=" + modifyDate +
                '}';
    }
}
