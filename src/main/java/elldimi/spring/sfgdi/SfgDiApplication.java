package elldimi.spring.sfgdi;

import elldimi.spring.sfgdi.controllers.ConstructorInjectedController;
import elldimi.spring.sfgdi.controllers.MyController;
import elldimi.spring.sfgdi.controllers.PropertyInjectedController;
import elldimi.spring.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        //run() -> This method returns an application context.
        MyController myController = (MyController) context.getBean("myController");
        //beans are always written with a small first letter.

        String hello = myController.sayHello();

        System.out.println(hello);

        System.out.println("------------------------------------------------------------Property");
        PropertyInjectedController propertyInjectedController =
                (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------------------------------------------------------------Setter");
        SetterInjectedController setterInjectedController =
                (SetterInjectedController) context.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("------------------------------------------------------------Constructor");
		ConstructorInjectedController constructorInjectedController =
				(ConstructorInjectedController) context.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());


	}

}
