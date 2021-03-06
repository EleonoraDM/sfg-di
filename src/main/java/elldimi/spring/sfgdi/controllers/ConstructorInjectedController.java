package elldimi.spring.sfgdi.controllers;

import elldimi.spring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private final GreetingService service;

    public ConstructorInjectedController
            (@Qualifier("constructorGreetingService") GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return this.service.sayGreeting();
    }
}
