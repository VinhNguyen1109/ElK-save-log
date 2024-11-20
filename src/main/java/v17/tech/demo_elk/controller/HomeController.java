package v17.tech.demo_elk.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import v17.tech.demo_elk.entity.UserJourney;
import v17.tech.demo_elk.service.UserJourneyService;

@RestController
@Slf4j
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class HomeController {

    private final UserJourneyService userJourneyService;

    @PostMapping("/view-detail-page")
    public String ViewDetailPage(@RequestBody UserJourney userJourney){
        userJourneyService.saveLogUserJourney(userJourney);
        return "Profile page";
    }

    @PostMapping("/")
    public String HomePage(@RequestBody UserJourney userJourney){
        userJourneyService.saveLogUserJourney(userJourney);
        return "Welcome to Home page";
    }

    @PostMapping("/profile-page")
    public String ProfilePage(@RequestBody UserJourney userJourney){
        userJourneyService.saveLogUserJourney(userJourney);
        return "Profile page";
    }

    @PostMapping("/log-out-page")
    public String LogOutPage(@RequestBody UserJourney userJourney){
        userJourneyService.saveLogUserJourney(userJourney);
        return "Profile page";
    }


    @PostMapping("/pay-page")
    public String PayPage(@RequestBody UserJourney userJourney){
        userJourneyService.saveLogUserJourney(userJourney);
        return "Profile page";
    }

}