package elldimi.spring.sfgdi.controllers;

import elldimi.spring.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService service;

    public String getGreeting() {
        return this.service.sayGreeting();
    }
}
