package com.assignment.song.player.management.songplayer.management.api.delegates.interfaces;

import com.assignment.song.player.management.songplayer.management.api.resources.GetNumberOfAllowedResultsInput;

public interface IGetNumberOfAllowedResultsDelegate {
    Integer getNumberOfAllowedResults(GetNumberOfAllowedResultsInput input);
}
