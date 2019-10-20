package com.assignment.song.player.management.songplayer.management.api.mappers.implementation;

import com.assignment.song.player.management.songplayer.management.api.mappers.interfaces.IMapGetNumberOfAllowedResultsInput;
import com.assignment.song.player.management.songplayer.management.api.resources.GetNumberOfAllowedResultsInput;
import com.assignment.song.player.management.songplayer.management.services.business.datamodel.interfaces.IGetNumberOfAllowedResultsInputDM;

import javax.inject.Inject;

public class MapGetNumberOfAllowedResultsInput implements IMapGetNumberOfAllowedResultsInput {
    @Inject
    private IGetNumberOfAllowedResultsInputDM getNumberOfAllowedResultsInputDM;
    @Override
    public IGetNumberOfAllowedResultsInputDM map(GetNumberOfAllowedResultsInput input) {
        if(input == null){
            return null;
        }
        getNumberOfAllowedResultsInputDM.setUserId(input.getUserId());

        return getNumberOfAllowedResultsInputDM;
    }
}
