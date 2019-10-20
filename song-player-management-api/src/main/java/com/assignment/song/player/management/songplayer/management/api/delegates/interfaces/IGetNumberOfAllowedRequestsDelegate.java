package com.assignment.song.player.management.songplayer.management.api.delegates.interfaces;

import com.assignment.song.player.management.songplayer.management.api.resources.GetNumberOfAllowedResultsInput;

public interface IGetNumberOfAllowedRequestsDelegate {
    Integer getNumberOfAllowedRequests(GetNumberOfAllowedResultsInput input);
}
