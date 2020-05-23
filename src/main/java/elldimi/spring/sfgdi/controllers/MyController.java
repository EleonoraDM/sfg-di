package elldimi.spring.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Spring has just created a new object for you.");

        return "Use it!";
    }
}
