package mum.edu;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		/*
		 * Greeting greetingService = (Greeting)
		 * context.getBean("greeetingService"); greetingService.sayHello();
		 */

		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();

		context.close();
	}
}
