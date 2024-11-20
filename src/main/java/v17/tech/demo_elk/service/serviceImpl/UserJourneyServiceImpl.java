package v17.tech.demo_elk.service.serviceImpl;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Service;
import v17.tech.demo_elk.service.UserJourneyService;
import v17.tech.demo_elk.entity.UserJourney;

import java.time.LocalDateTime;

@Service
@Slf4j
public class UserJourneyServiceImpl implements UserJourneyService {
    @Override
    public void saveLogUserJourney(UserJourney userJourney) {
        userJourney.setTimeInScreen(LocalDateTime.now());
        MDC.put("userId", userJourney.getUserId());
        MDC.put("preScreenName", userJourney.getPreScreenName());
        MDC.put("screenName", userJourney.getScreenName());
        MDC.put("timeInScreen", userJourney.getTimeInScreen().toString());
        MDC.put("sessionId", userJourney.getSessionId());
        log.info("Save log user journey");
        MDC.clear();
    }
}
