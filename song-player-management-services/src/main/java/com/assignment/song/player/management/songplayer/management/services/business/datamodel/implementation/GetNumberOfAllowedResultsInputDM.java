package com.assignment.song.player.management.songplayer.management.services.business.datamodel.implementation;

import com.assignment.song.player.management.songplayer.management.services.business.datamodel.interfaces.IGetNumberOfAllowedResultsInputDM;

public class GetNumberOfAllowedResultsInputDM implements IGetNumberOfAllowedResultsInputDM {
    private String userId;
    private String planType;

    @Override
    public String getUserId() {
        return userId;
    }

    @Override
    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String getPlanType() {
        return planType;
    }

    @Override
    public void setPlanType(String planType) {
        this.planType = planType;
    }
}
