package com.assignment.song.player.management.songplayer.management.api.controller;

import com.assignment.song.player.management.songplayer.management.api.delegates.interfaces.IGetNumberOfAllowedRequestsDelegate;
import com.assignment.song.player.management.songplayer.management.api.delegates.interfaces.IGetNumberOfAllowedResultsDelegate;
import com.assignment.song.player.management.songplayer.management.api.resources.GetNumberOfAllowedResultsInput;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.Valid;

@RestController
public class SongPlayerController {
    @Inject
    private IGetNumberOfAllowedResultsDelegate getNumberOfAllowedResultsDelegate;
    @Inject
    private IGetNumberOfAllowedRequestsDelegate getNumberOfAllowedRequestsDelegate;

    @PostMapping("/enforcement/api/v0/getNumberOfAllowedResults")
    public ResponseEntity<Integer> getNumberOfAllowedResults(@Valid @RequestBody GetNumberOfAllowedResultsInput input){
        Integer allowedResults = getNumberOfAllowedResultsDelegate.getNumberOfAllowedResults(input);
        if(allowedResults < 0 ){
            return ResponseEntity.badRequest().body(allowedResults);
        }

        return ResponseEntity.ok(allowedResults);
    }

    @PostMapping("/enforcement/api/v0/getNumberOfAllowedRequests")
    public ResponseEntity<Integer> getNumberOfAllowedRequests(@Valid @RequestBody GetNumberOfAllowedResultsInput input){
        Integer allowedRequests = getNumberOfAllowedRequestsDelegate.getNumberOfAllowedRequests(input);

        if(allowedRequests < 0){
           return ResponseEntity.badRequest().body(allowedRequests);
        }

        return ResponseEntity.ok(allowedRequests);
    }
}
