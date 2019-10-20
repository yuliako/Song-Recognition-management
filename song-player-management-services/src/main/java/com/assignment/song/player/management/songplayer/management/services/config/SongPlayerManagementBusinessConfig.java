package com.assignment.song.player.management.songplayer.management.services.config;

import com.assignment.song.player.management.songplayer.management.services.business.datamodel.implementation.GetNumberOfAllowedResultsInputDM;
import com.assignment.song.player.management.songplayer.management.services.business.datamodel.interfaces.IGetNumberOfAllowedResultsInputDM;
import com.assignment.song.player.management.songplayer.management.services.business.implementation.*;
import com.assignment.song.player.management.songplayer.management.services.business.interfaces.IGetNumberOfAllowedResultsService;
import com.assignment.song.player.management.songplayer.management.services.business.interfaces.IGetNumberOfAllowedRequestsService;
import com.assignment.song.player.management.songplayer.management.services.business.interfaces.ISongPlayerStrategy;
import com.assignment.song.player.management.songplayer.management.services.gateways.implementation.GetPlanTypeByUserService;
import com.assignment.song.player.management.songplayer.management.services.gateways.interfaces.IGetPlanTypeByUserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.assignment.song.player.management.songplayer.management.services.*"})
public class SongPlayerManagementBusinessConfig {
    @Bean
    public IGetNumberOfAllowedResultsInputDM getNumberOfAllowedResultsInputDM(){
        return new GetNumberOfAllowedResultsInputDM();
    }

    @Bean
    public IGetNumberOfAllowedRequestsService getNumberOfAllowedResultsService(){
        return new GetNumberOfAllowedRequestsService();
    }

    @Bean
    public IGetPlanTypeByUserService getPlanTypeByUserService(){
        return new GetPlanTypeByUserService();
    }

    @Bean(name = "FreePlanStrategy")
    public ISongPlayerStrategy freePlanStrategy() {
        return new FreePlanStrategy();
    }

    @Bean(name = "MonthlyPlanStrategy")
    public ISongPlayerStrategy monthlyPlanStrategy() {
        return new MonthlyPlanStrategy();
    }

    @Bean(name = "PerUsagePlanStrategy")
    public ISongPlayerStrategy perUsagePlanStrategy() {
        return new PerUsagePlanStrategy();
    }

    @Bean
    public SongPlayerStrategyFactory songPlayerStrategyFactory(){
        return new SongPlayerStrategyFactory();
    }

    @Bean
    public IGetNumberOfAllowedResultsService getNumberOfAllowedRequestsService(){
        return new GetNumberOfAllowedResultsService();
    }
}
