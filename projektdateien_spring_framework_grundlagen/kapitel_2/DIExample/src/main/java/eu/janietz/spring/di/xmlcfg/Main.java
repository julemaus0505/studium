package eu.janietz.spring.di.xmlcfg;

import eu.janietz.spring.di.xmlcfg.model.Auto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("di-config.xml");

        Auto a3 = (Auto) context.getBean("A3");
        System.out.println(a3);
    }

}
