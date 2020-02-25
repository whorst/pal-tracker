package test.pivotal.pal.tracker;

import io.pivotal.pal.tracker.PalTrackerApplication;
import io.pivotal.pal.tracker.WelcomeController;
import io.pivotal.pal.tracker.WelcomeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(WelcomeController.class)
@ContextConfiguration(classes = PalTrackerApplication.class)
public class WelcomeControllerMockMvcTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private WelcomeService welcomeService;

    @Test
    void sayHello_should_return_valid_value_with_200_given_valid_url() throws Exception {

        //arrange
        given(welcomeService.getGreeting()).willReturn("Hello From Test");

        //act and assert
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello From Test"));


        //verify
//        verify(welcomeService.getGreeting());
    }
}
