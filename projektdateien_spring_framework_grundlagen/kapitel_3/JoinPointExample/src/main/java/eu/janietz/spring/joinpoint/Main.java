package eu.janietz.spring.joinpoint;

import eu.janietz.spring.joinpoint.example.BankAccount;
import eu.janietz.spring.joinpoint.example.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");
        HelloWorldService helloWorldService = (HelloWorldService) context.getBean("helloWorldService");

        BankAccount meinKonto = (BankAccount) context.getBean("bankAccount");
        meinKonto.setAccountID(4);
        meinKonto.insertMoney(200);


        helloWorldService.getMessage();
    }

}
