package com.assignment.song.player.management.songplayer.management.services.business.implementation;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserPlanDAO;
import com.assignment.song.player.management.songplayer.management.persistence.dao.UserUsageDAO;
import com.assignment.song.player.management.songplayer.management.services.config.Constants;

public class MonthlyPlanStrategy extends SongPlayerStrategy {

    @Override
    public Integer calculateAllowedRequests(UserUsageDAO user, UserPlanDAO userPlan) {
        if(userPlan.getPlanType().contains(Constants.unlimited)){
            return Constants.maxNumberOfAllowedResults;
        }
        return userPlan.getCurrency() - user.getNumberOfRecognitions();
    }

    @Override
    public Integer calculateAllowedResults(UserUsageDAO user, UserPlanDAO plan) {
        if(calculateAllowedRequests(user,plan) < 1){
            return 0;
        }
        return Constants.maxNumberOfAllowedResults;
    }
}
