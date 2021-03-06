package com.active.presentation.repository;

import com.active.presentation.ApBootApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 6/27/14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {ApBootApplication.class})
@ActiveProfiles("local")
public class PresentationDashboardRepositoryTest {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private PresentationDashboardRepository dashboardRepository;

    @Autowired
    private SpeakerRepository speakerRepository;

    @Test
    public void testCountBySpeaker() throws Exception {

    }
}
