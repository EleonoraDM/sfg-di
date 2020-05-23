package elldimi.spring.sfgdi.controllers;

import elldimi.spring.sfgdi.services.GreetingService;

public class SetterInjectedController {

    private GreetingService service;

    public void setService(GreetingService service) {
        this.service = service;
    }

    public String getGreeting() {
        return this.service.sayGreeting();
    }
}
