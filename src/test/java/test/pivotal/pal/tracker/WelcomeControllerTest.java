package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.PalTrackerApplication;
import io.pivotal.pal.tracker.WelcomeController;
import io.pivotal.pal.tracker.WelcomeService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=PalTrackerApplication.class)
public class WelcomeControllerTest {

    @MockBean
    WelcomeService welcomeService;

    @Test
    public void itSaysHello() throws Exception {
        given(welcomeService.getGreeting()).willReturn("A welcome message");
        WelcomeController controller = new WelcomeController(welcomeService);
        assertThat(controller.sayHello()).isEqualTo("A welcome message");
    }
}
