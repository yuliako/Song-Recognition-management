package com.assignment.song.player.management.songplayer.management.api.mappers.interfaces;

import com.assignment.song.player.management.songplayer.management.api.resources.GetNumberOfAllowedResultsInput;
import com.assignment.song.player.management.songplayer.management.services.business.datamodel.interfaces.IGetNumberOfAllowedResultsInputDM;

public interface IMapGetNumberOfAllowedResultsInput {

    IGetNumberOfAllowedResultsInputDM map(GetNumberOfAllowedResultsInput input);

}
