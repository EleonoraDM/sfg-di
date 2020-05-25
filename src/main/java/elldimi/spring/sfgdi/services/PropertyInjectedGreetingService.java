package elldimi.spring.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Spring can create a new object for you via property DI! Use it!";
    }
}
