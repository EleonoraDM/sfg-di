package elldimi.spring.sfgdi.controllers;

import elldimi.spring.sfgdi.services.GreetingService;

public class PropertyInjectedController {

    public GreetingService service;

    public String getGreeting() {
        return this.service.sayGreeting();
    }
}
