package com.assignment.song.player.management.songplayer.management.persistence.repository.tests;

import com.assignment.song.player.management.songplayer.management.persistence.dao.UserUsageDAO;
import com.assignment.song.player.management.songplayer.management.persistence.repository.interfaces.IH2UserUsageRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;
import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootApplication
public class H2UserUsageRepositoryTest {
    @Inject
    private TestEntityManager entityManager;
    @Inject
    private IH2UserUsageRepository userUsageRepository;

    @Test
    public void checkUserPlan_mosheFree(){
        Optional<UserUsageDAO> userUsageDAO = userUsageRepository.findById("mosheFree");
        Assert.assertTrue(userUsageDAO.isPresent());
        Assert.assertEquals("Free Plan",userUsageDAO.get().getPlanType());
    }




}
