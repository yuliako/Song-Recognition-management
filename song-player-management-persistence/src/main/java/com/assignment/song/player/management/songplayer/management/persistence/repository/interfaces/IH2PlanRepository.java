package com.assignment.song.player.management.songplayer.management.persistence.repository.interfaces;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserPlanDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IH2PlanRepository extends JpaRepository<UserPlanDAO,String> {
}
