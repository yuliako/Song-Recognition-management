package com.assignment.song.player.management.songplayer.management.services.business.implementation;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserPlanDAO;
import com.assignment.song.player.management.songplayer.management.persistence.dao.UserUsageDAO;
import com.assignment.song.player.management.songplayer.management.services.business.datamodel.interfaces.IGetNumberOfAllowedResultsInputDM;
import com.assignment.song.player.management.songplayer.management.services.config.Constants;

public class PerUsagePlanStrategy extends SongPlayerStrategy {

    @Override
    public Integer getNumberOfAllowedResults(IGetNumberOfAllowedResultsInputDM inputDM,
                                             UserPlanDAO userPlan) {
        return calculateAllowedRequests(null,null);
    }

    @Override
    public Integer calculateAllowedRequests(UserUsageDAO user, UserPlanDAO userPlan) {
        return Constants.maxNumberOfAllowedResults;
    }

    @Override
    public Integer calculateAllowedResults(UserUsageDAO user, UserPlanDAO plan) {
        return Constants.maxNumberOfAllowedResults;
    }
}
