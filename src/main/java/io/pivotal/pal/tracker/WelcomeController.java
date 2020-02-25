package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    private String message;
    private WelcomeService welcomeService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService){
        this.welcomeService = welcomeService;
    }

    public WelcomeController(@Value("${WELCOME_MESSAGE}") String message){
        this.message = message;
    }

    @GetMapping("/")
    public String sayHello(){
        return welcomeService.getGreeting();
    }
}
