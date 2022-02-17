package eu.janietz.spring.aop;

import eu.janietz.spring.aop.example.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop-config.xml");

        Car car = context.getBean(Car.class);
        car.addFuel(20);
        car.startEngine();
        car.drive();
    }

}
