package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.PalTrackerApplication;
import io.pivotal.pal.tracker.WelcomeService;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith({MockitoExtension.class})
@ContextConfiguration(classes = PalTrackerApplication.class)
public class WelcomeServiceTest {

    private WelcomeService welcomeService;

    @BeforeEach
    void setUp(){
        welcomeService = new WelcomeService();
    }

    @Test
    void getGreeting_should_return_hello_given_some_param(){
        String result = welcomeService.getGreeting();
    }
}
