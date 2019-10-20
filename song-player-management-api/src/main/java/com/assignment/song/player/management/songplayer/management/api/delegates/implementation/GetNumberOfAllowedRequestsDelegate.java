package com.assignment.song.player.management.songplayer.management.api.delegates.implementation;

import com.assignment.song.player.management.songplayer.management.api.delegates.interfaces.IGetNumberOfAllowedRequestsDelegate;
import com.assignment.song.player.management.songplayer.management.api.mappers.interfaces.IMapGetNumberOfAllowedResultsInput;
import com.assignment.song.player.management.songplayer.management.api.resources.GetNumberOfAllowedResultsInput;
import com.assignment.song.player.management.songplayer.management.services.business.interfaces.IGetNumberOfAllowedRequestsService;

import javax.inject.Inject;

public class GetNumberOfAllowedRequestsDelegate implements IGetNumberOfAllowedRequestsDelegate {
    @Inject
    private IMapGetNumberOfAllowedResultsInput mapGetNumberOfAllowedResultsInput;
    @Inject
    private IGetNumberOfAllowedRequestsService getNumberOfAllowedRequestsService;
    @Override
    public Integer getNumberOfAllowedRequests(GetNumberOfAllowedResultsInput input) {
        return getNumberOfAllowedRequestsService.getNumberOfAllowedRequests(
                mapGetNumberOfAllowedResultsInput.map(input));
    }
}
