package com.assignment.song.player.management.songplayer.management.services.business.implementation;

import com.assignment.song.player.management.songplayer.management.services.business.interfaces.ISongPlayerStrategy;
import com.assignment.song.player.management.songplayer.management.services.config.Constants;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.util.StringUtils;

import javax.inject.Inject;

public class SongPlayerStrategyFactory {
    @Inject
    @Qualifier("FreePlanStrategy")
    private ISongPlayerStrategy freePlanStrategy;

    @Inject
    @Qualifier("MonthlyPlanStrategy")
    private ISongPlayerStrategy monthlyPlanStrategy;

    @Inject
    @Qualifier("PerUsagePlanStrategy")
    private ISongPlayerStrategy perUsagePlanStrategy;

    public ISongPlayerStrategy getStrategyByPlanType(String planType){

        if(!StringUtils.isEmpty(planType)){
            if(Constants.freePlanType.equals(planType)){
                return freePlanStrategy;
            }
            else if(planType.contains(Constants.monthlyPlanType)){
                return monthlyPlanStrategy;
            }
            else if(Constants.perUsagePlan.equals(planType)){
                return perUsagePlanStrategy;
            }
        }



       return null;
    }


}
