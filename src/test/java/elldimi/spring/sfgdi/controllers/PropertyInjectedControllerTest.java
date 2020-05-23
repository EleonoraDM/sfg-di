package elldimi.spring.sfgdi.controllers;

import elldimi.spring.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        this.controller = new PropertyInjectedController();
        this.controller.service = new GreetingServiceImpl();
    }

    @Test
    void getGreeting() {
        System.out.println(this.controller.getGreeting());
    }
}