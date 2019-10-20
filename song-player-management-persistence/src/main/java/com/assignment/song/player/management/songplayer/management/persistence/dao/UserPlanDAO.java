package com.assignment.song.player.management.songplayer.management.persistence.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "USER_PLAN")
public class UserPlanDAO {

    @Column(name = "PLAN_TYPE" ,length=50, nullable=false)
    private String planType;
    @Id
    @Column(name = "USER_ID" ,length=50, nullable=false)
    private String userId;

    @Column(name = "CURRENCY")
    private Integer currency;

    @Column(name = "NUM_ALLOWED_RESULTS")
    private Integer numberOfAllowedResults;

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public Integer getCurrency() {
        return currency;
    }

    public Integer getNumberOfAllowedResults() {
        return numberOfAllowedResults;
    }

    public void setNumberOfAllowedResults(Integer numberOfAllowedResults) {
        this.numberOfAllowedResults = numberOfAllowedResults;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
