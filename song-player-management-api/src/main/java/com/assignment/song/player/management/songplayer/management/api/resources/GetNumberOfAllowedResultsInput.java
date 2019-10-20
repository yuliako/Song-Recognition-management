package com.assignment.song.player.management.songplayer.management.api.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetNumberOfAllowedResultsInput {
    @JsonProperty("userId")
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
