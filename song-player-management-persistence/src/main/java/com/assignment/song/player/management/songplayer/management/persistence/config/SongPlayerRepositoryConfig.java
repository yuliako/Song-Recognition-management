package com.assignment.song.player.management.songplayer.management.persistence.config;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserUsageDAO;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = { "com.assignment.song.player.management.songplayer.management.persistence.*"})
@EntityScan("com.assignment.song.player.management.songplayer.management.persistence.*")
@EnableJpaRepositories(basePackages = "com.assignment.song.player.management.songplayer.management.persistence.repository.interfaces")
public class SongPlayerRepositoryConfig {
    @Bean
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public UserUsageDAO userUsageDAO(){
        return new UserUsageDAO();
    }



}
