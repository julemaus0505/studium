package eu.janietz.spring.di.anncfg;

import eu.janietz.spring.di.anncfg.scan.HelloWorldPrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        HelloWorldPrinter helloWorldPrinter = (HelloWorldPrinter) context.getBean("helloWorldPrinter");

        helloWorldPrinter.print();

        context.registerShutdownHook();
    }

}
