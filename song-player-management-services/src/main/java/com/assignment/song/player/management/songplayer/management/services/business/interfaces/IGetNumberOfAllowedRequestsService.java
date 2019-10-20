package com.assignment.song.player.management.songplayer.management.services.business.interfaces;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserPlanDAO;
import com.assignment.song.player.management.songplayer.management.services.business.datamodel.interfaces.IGetNumberOfAllowedResultsInputDM;

public interface IGetNumberOfAllowedRequestsService {
    Integer getNumberOfAllowedRequests(IGetNumberOfAllowedResultsInputDM inputDM);
    Integer getNumberOfAllowedRequests(IGetNumberOfAllowedResultsInputDM inputDM, UserPlanDAO userPlan);
}
