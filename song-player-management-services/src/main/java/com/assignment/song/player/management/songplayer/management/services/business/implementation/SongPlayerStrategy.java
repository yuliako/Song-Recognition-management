package com.assignment.song.player.management.songplayer.management.services.business.implementation;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserPlanDAO;
import com.assignment.song.player.management.songplayer.management.persistence.dao.UserUsageDAO;
import com.assignment.song.player.management.songplayer.management.persistence.repository.interfaces.IH2UserUsageRepository;
import com.assignment.song.player.management.songplayer.management.services.business.datamodel.interfaces.IGetNumberOfAllowedResultsInputDM;
import com.assignment.song.player.management.songplayer.management.services.business.interfaces.ISongPlayerStrategy;

import javax.inject.Inject;
import java.util.Optional;

public abstract class SongPlayerStrategy implements ISongPlayerStrategy {
    @Inject
    private IH2UserUsageRepository userUsageRepository;

    @Override
    public Integer getNumberOfAllowedResults(IGetNumberOfAllowedResultsInputDM inputDM
    , UserPlanDAO userPlan) {
        Optional<UserUsageDAO> user = userUsageRepository.findById(inputDM.getUserId());
        if(!user.isPresent()){
            return -1;
        }

        return (calculateAllowedResults(user.get(), userPlan)) ;
    }

    @Override
    public Integer getNumberOfAllowedRequests(IGetNumberOfAllowedResultsInputDM inputDM
            , UserPlanDAO userPlan) {
        Optional<UserUsageDAO> user = userUsageRepository.findById(inputDM.getUserId());
        if(!user.isPresent()){
            return -1;
        }

        return (calculateAllowedRequests(user.get(), userPlan)) ;
    }

    public abstract Integer calculateAllowedRequests(UserUsageDAO user, UserPlanDAO plan);
    public abstract Integer calculateAllowedResults(UserUsageDAO user, UserPlanDAO plan);




}
