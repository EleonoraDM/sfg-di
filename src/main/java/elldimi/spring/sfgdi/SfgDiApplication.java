package elldimi.spring.sfgdi;

import elldimi.spring.sfgdi.controllers.MyController;
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

	}

}
