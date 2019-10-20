package com.assignment.song.player.management.songplayer.management.persistence.dao;

import javax.persistence.*;

@Entity
@Table(name= "USER_USAGE")
public class UserUsageDAO {
    @Id
    @Column(name="USER_ID", length=50, nullable=false)
    private String userId;
    @Column(name="PLAN_TYPE", length=50, nullable=false)
    private String planType;
    @Column(name="RECOGNITIONS_NUM")
    private Integer numberOfRecognitions;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public Integer getNumberOfRecognitions() {
        return numberOfRecognitions;
    }

    public void setNumberOfRecognitions(Integer numberOfRecognitions) {
        this.numberOfRecognitions = numberOfRecognitions;
    }
    public UserUsageDAO(){

    }
}
