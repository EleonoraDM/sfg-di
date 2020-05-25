package elldimi.spring.sfgdi.controllers;

import elldimi.spring.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.service = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }
}