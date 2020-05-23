package elldimi.spring.sfgdi.controllers;

import elldimi.spring.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService service;

    public ConstructorInjectedController(GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return this.service.sayGreeting();
    }
}
