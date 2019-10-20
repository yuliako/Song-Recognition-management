package com.assignment.song.player.management.songplayer.management.services.business.implementation;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserPlanDAO;
import com.assignment.song.player.management.songplayer.management.persistence.dao.UserUsageDAO;

public class FreePlanStrategy extends SongPlayerStrategy {

    @Override
    public Integer calculateAllowedRequests(UserUsageDAO user, UserPlanDAO userPlan) {
        return userPlan.getCurrency() - user.getNumberOfRecognitions();
    }

    @Override
    public Integer calculateAllowedResults(UserUsageDAO user, UserPlanDAO plan) {
        if(calculateAllowedRequests(user,plan) < 1){
            return 0;
        }
        return plan.getNumberOfAllowedResults();
    }
}
