package com.assignment.song.player.management.songplayer.management.services.business.implementation;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserPlanDAO;
import com.assignment.song.player.management.songplayer.management.services.business.datamodel.interfaces.IGetNumberOfAllowedResultsInputDM;
import com.assignment.song.player.management.songplayer.management.services.business.interfaces.IGetNumberOfAllowedRequestsService;
import com.assignment.song.player.management.songplayer.management.services.gateways.interfaces.IGetPlanTypeByUserService;
import org.springframework.util.StringUtils;

import javax.inject.Inject;

public class GetNumberOfAllowedRequestsService implements IGetNumberOfAllowedRequestsService {
    @Inject
    private IGetPlanTypeByUserService getPlanTypeByUserService;

    @Inject
    private SongPlayerStrategyFactory songPlayerStrategyFactory;

    @Override
    public Integer getNumberOfAllowedRequests(IGetNumberOfAllowedResultsInputDM inputDM) {
       UserPlanDAO userPlan = getPlanTypeByUserService.getPlanTypeByUserId(inputDM.getUserId());

        if(userPlan == null ||
               StringUtils.isEmpty(userPlan.getPlanType())){
            return -1;
        }

        return getNumberOfAllowedRequests(inputDM,userPlan);
    }

    @Override
    public Integer getNumberOfAllowedRequests(IGetNumberOfAllowedResultsInputDM inputDM, UserPlanDAO userPlan) {
        Integer numberOfAllowedRequests = songPlayerStrategyFactory.getStrategyByPlanType(userPlan.getPlanType())
                .getNumberOfAllowedRequests(inputDM,userPlan);

        return numberOfAllowedRequests;
    }
}
