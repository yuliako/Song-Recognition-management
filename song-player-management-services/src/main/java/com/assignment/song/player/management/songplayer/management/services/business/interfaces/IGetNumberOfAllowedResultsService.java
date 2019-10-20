package com.assignment.song.player.management.songplayer.management.services.business.interfaces;

import com.assignment.song.player.management.songplayer.management.services.business.datamodel.interfaces.IGetNumberOfAllowedResultsInputDM;

public interface IGetNumberOfAllowedResultsService {
    Integer getNumberOfAllowedResults(IGetNumberOfAllowedResultsInputDM inputDM);
}
