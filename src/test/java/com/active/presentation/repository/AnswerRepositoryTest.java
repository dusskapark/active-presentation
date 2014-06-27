package com.active.presentation.repository;

import com.active.presentation.ApBootApplication;
import com.active.presentation.domain.Answer;
import com.active.presentation.domain.PresentationDashboard;
import com.active.presentation.domain.Speaker;
import com.active.presentation.repository.dto.AnswerResultDto;
import org.joda.time.DateTime;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by bungubbang
 * Email: sungyong.jung@sk.com
 * Date: 6/13/14
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = {ApBootApplication.class})
@ActiveProfiles("local")
public class AnswerRepositoryTest {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private PresentationDashboardRepository dashboardRepository;

    @Autowired
    private SpeakerRepository speakerRepository;

    @Test
    public void testFindBySpeaker() {
        // Given
        Speaker speaker = speakerRepository.findByEmail("bungubbang1@nate.com");
        System.out.println("speaker = " + speaker);
        // When
        long count = answerRepository.count();
        System.out.println("count = " + count);
        Long l = answerRepository.countBySpeaker(speaker);
        System.out.println("l = " + l);
        // Then


        Long beforeDate = answerRepository.countBySpeakerBeforeDate(speaker, new DateTime().minusDays(2).toDate());
        System.out.println("beforeDate = " + new DateTime().minusDays(2).toDate());
        System.out.println("beforeDate = " + beforeDate);


        Long afterDate = answerRepository.countBySpeakerAfterDate(speaker, new DateTime().withTimeAtStartOfDay().toDate());
        System.out.println("new DateTime().withTimeAtStartOfDay().toDate() = " + new DateTime().withTimeAtStartOfDay().toDate());
        System.out.println("afterDate = " + afterDate);
    }

}
