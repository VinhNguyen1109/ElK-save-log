package v17.tech.demo_elk.entity;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserJourney {
    private String userId;
    private String sessionId;
    private String screenName;
    private String preScreenName;

    private LocalDateTime timeInScreen;
}
