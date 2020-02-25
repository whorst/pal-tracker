package io.pivotal.pal.tracker;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {

    public String getGreeting(){
        return "Hello from test";
    }
}
