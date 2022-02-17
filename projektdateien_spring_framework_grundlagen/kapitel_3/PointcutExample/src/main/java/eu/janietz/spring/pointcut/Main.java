package eu.janietz.spring.pointcut;

import eu.janietz.spring.pointcut.example.HelloWorldService;
import eu.janietz.spring.pointcut.introduction.ProxyInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");
        HelloWorldService helloWorldService = (HelloWorldService) context.getBean("helloWorldService");

        System.out.println(helloWorldService.getMessage());
        System.out.println(helloWorldService.getBaseMessage());
        System.out.println(((ProxyInterface)helloWorldService).getProxyMessage());
    }

}
