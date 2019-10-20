package com.assignment.song.player.management.songplayer.management.services.gateways.interfaces;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserPlanDAO;

public interface IGetPlanTypeByUserService {
    UserPlanDAO getPlanTypeByUserId(String userId);
}
