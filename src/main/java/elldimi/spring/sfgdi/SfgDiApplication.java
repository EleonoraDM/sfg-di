package elldimi.spring.sfgdi;

import elldimi.spring.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SfgDiApplication.class, args);
        //run() -> This method returns an application context.

        I18nController i18nController = (I18nController) context.getBean("i18nController");
        System.out.println(i18nController.congrats());

        MyController myController = (MyController) context.getBean("myController");
        //beans are always written with a small first letter.


        System.out.println("------------------------------------------------------------Primary Bean");
        System.out.println(myController.sayHello());

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
