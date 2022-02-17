package eu.janietz.spring.introduction;

import eu.janietz.spring.introduction.fancy.FancyMessagePrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-config.xml");
        HelloWorldService helloWorldService = (HelloWorldService)ctx.getBean("helloWorldService");

        System.out.println(helloWorldService.getMessage());

        FancyMessagePrinter fancyMessagePrinter = (FancyMessagePrinter)helloWorldService;
        System.out.println(fancyMessagePrinter.printMessage());
    }

}
