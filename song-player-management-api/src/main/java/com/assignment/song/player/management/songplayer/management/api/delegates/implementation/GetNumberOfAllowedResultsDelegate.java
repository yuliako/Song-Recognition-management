package com.assignment.song.player.management.songplayer.management.api.delegates.implementation;

import com.assignment.song.player.management.songplayer.management.api.delegates.interfaces.IGetNumberOfAllowedResultsDelegate;
import com.assignment.song.player.management.songplayer.management.api.mappers.interfaces.IMapGetNumberOfAllowedResultsInput;
import com.assignment.song.player.management.songplayer.management.api.resources.GetNumberOfAllowedResultsInput;
import com.assignment.song.player.management.songplayer.management.services.business.interfaces.IGetNumberOfAllowedRequestsService;
import com.assignment.song.player.management.songplayer.management.services.business.interfaces.IGetNumberOfAllowedResultsService;

import javax.inject.Inject;

public class GetNumberOfAllowedResultsDelegate implements IGetNumberOfAllowedResultsDelegate {
    @Inject
    private IMapGetNumberOfAllowedResultsInput mapGetNumberOfAllowedResultsInput;
    @Inject
    private IGetNumberOfAllowedResultsService getNumberOfAllowedResultsService;
    @Override
    public Integer getNumberOfAllowedResults(GetNumberOfAllowedResultsInput input) {
        return getNumberOfAllowedResultsService.getNumberOfAllowedResults(
                mapGetNumberOfAllowedResultsInput.map(input));
    }
}
