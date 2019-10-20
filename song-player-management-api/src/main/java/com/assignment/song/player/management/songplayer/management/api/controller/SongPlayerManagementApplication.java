package com.assignment.song.player.management.songplayer.management.api.controller;

import com.assignment.song.player.management.songplayer.management.api.validators.GetNumberOfAllowedResultsInputValidator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.event.ValidatingRepositoryEventListener;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@SpringBootApplication
public class SongPlayerManagementApplication implements RepositoryRestConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SongPlayerManagementApplication.class, args);
	}

	@Override
	public void configureValidatingRepositoryEventListener(ValidatingRepositoryEventListener validatingListener) {
		validatingListener.addValidator
				("beforeCreate", new GetNumberOfAllowedResultsInputValidator());
	}
}
