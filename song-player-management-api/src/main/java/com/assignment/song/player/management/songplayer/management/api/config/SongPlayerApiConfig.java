package com.assignment.song.player.management.songplayer.management.api.config;

import com.assignment.song.player.management.songplayer.management.api.delegates.implementation.GetNumberOfAllowedRequestsDelegate;
import com.assignment.song.player.management.songplayer.management.api.delegates.implementation.GetNumberOfAllowedResultsDelegate;
import com.assignment.song.player.management.songplayer.management.api.delegates.interfaces.IGetNumberOfAllowedRequestsDelegate;
import com.assignment.song.player.management.songplayer.management.api.delegates.interfaces.IGetNumberOfAllowedResultsDelegate;
import com.assignment.song.player.management.songplayer.management.api.mappers.implementation.MapGetNumberOfAllowedResultsInput;
import com.assignment.song.player.management.songplayer.management.api.mappers.interfaces.IMapGetNumberOfAllowedResultsInput;
import com.assignment.song.player.management.songplayer.management.api.validators.GetNumberOfAllowedResultsInputValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SongPlayerApiConfig {
    @Bean
    public GetNumberOfAllowedResultsInputValidator getNumberOfAllowedResultsInputValidator(){
        return new GetNumberOfAllowedResultsInputValidator();
    }

    @Bean
    public IGetNumberOfAllowedResultsDelegate getNumberOfAllowedResultsDelegate(){
        return new GetNumberOfAllowedResultsDelegate();
    }
    @Bean
    public IMapGetNumberOfAllowedResultsInput mapGetNumberOfAllowedResultsInput(){
        return new MapGetNumberOfAllowedResultsInput();
    }

    @Bean
    public IGetNumberOfAllowedRequestsDelegate getNumberOfAllowedRequestsDelegate(){
        return new GetNumberOfAllowedRequestsDelegate();
    }

}
