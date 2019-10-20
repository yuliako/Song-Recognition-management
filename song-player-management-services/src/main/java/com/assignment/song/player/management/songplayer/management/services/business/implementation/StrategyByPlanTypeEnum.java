package com.assignment.song.player.management.songplayer.management.services.business.implementation;

import com.assignment.song.player.management.songplayer.management.services.business.interfaces.ISongPlayerStrategy;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public enum StrategyByPlanTypeEnum {

    FreePlan("Free Plan" , new FreePlanStrategy()),
    MontlyPlan("Monthly Plan" , new MonthlyPlanStrategy()),
    PerUsagePlan("Per Use Plan" , new PerUsagePlanStrategy());

    @Inject
    @Qualifier("FreePlanStrategy")
    private ISongPlayerStrategy freePlanStrategy;

    @Inject
    @Qualifier("MonthlyPlanStrategy")
    private ISongPlayerStrategy monthlyPlanStrategy;

    @Inject
    @Qualifier("PerUsagePlanStrategy")
    private ISongPlayerStrategy perUsagePlanStrategy;

    private String planType;
    private ISongPlayerStrategy songPlayerStrategy;


    StrategyByPlanTypeEnum(String planType , ISongPlayerStrategy songPlayerStrategy){
        this.planType = planType;
        this.songPlayerStrategy = songPlayerStrategy;
    }

    public ISongPlayerStrategy getSongPlayerStrategy() {
        return songPlayerStrategy;
    }

    public static StrategyByPlanTypeEnum getStrategyByPlanType(String planType){
        List<StrategyByPlanTypeEnum> enums = Arrays.asList(values());
        Optional<StrategyByPlanTypeEnum> strategy =enums.stream()
                .filter(strategyByPlanTypeEnum -> strategyByPlanTypeEnum.planType.equals(planType))
                .findFirst();
        if(strategy.isPresent()){
            return strategy.get();
        }
        throw new RuntimeException("No Handler found for Plan "+planType);
    }
}
