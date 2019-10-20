package com.assignment.song.player.management.songplayer.management.services.gateways.implementation;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserPlanDAO;
import com.assignment.song.player.management.songplayer.management.persistence.repository.interfaces.IH2PlanRepository;
import com.assignment.song.player.management.songplayer.management.services.gateways.interfaces.IGetPlanTypeByUserService;

import javax.inject.Inject;
import java.util.Optional;

public class GetPlanTypeByUserService implements IGetPlanTypeByUserService {
    @Inject
    private IH2PlanRepository planRepository;
    @Override
    public UserPlanDAO getPlanTypeByUserId(String userId) {
       Optional<UserPlanDAO> plan = planRepository.findById(userId);
       if(plan.isPresent()){
           return plan.get();
       }
        return null;
    }
}
