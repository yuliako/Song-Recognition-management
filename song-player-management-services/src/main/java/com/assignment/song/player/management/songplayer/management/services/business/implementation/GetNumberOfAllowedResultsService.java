package com.assignment.song.player.management.songplayer.management.services.business.implementation;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserPlanDAO;
import com.assignment.song.player.management.songplayer.management.services.business.datamodel.interfaces.IGetNumberOfAllowedResultsInputDM;
import com.assignment.song.player.management.songplayer.management.services.business.interfaces.IGetNumberOfAllowedResultsService;
import com.assignment.song.player.management.songplayer.management.services.gateways.interfaces.IGetPlanTypeByUserService;
import org.springframework.util.StringUtils;

import javax.inject.Inject;

public class GetNumberOfAllowedResultsService implements IGetNumberOfAllowedResultsService {
    @Inject
    private IGetPlanTypeByUserService getPlanTypeByUserService;

    @Inject
    private SongPlayerStrategyFactory songPlayerStrategyFactory;

    @Override
    public Integer getNumberOfAllowedResults(IGetNumberOfAllowedResultsInputDM inputDM) {
        UserPlanDAO userPlan = getPlanTypeByUserService.getPlanTypeByUserId(inputDM.getUserId());
        if(userPlan == null || StringUtils.isEmpty(userPlan.getPlanType())){
            return -1;
        }
        Integer numberOfAllowedResults = songPlayerStrategyFactory.getStrategyByPlanType(userPlan.getPlanType())
                .getNumberOfAllowedResults(inputDM,userPlan);

        return numberOfAllowedResults;
    }
}
