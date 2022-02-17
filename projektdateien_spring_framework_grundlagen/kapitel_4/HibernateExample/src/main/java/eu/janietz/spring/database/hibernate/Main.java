package eu.janietz.spring.database.hibernate;

import eu.janietz.spring.database.model.CarEntity;
import eu.janietz.spring.database.model.WheelEntity;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("hibernate-config.xml");
        CarDao carDao = context.getBean(CarDao.class);

        for (CarEntity car : carDao.getAllCars())
        {
            System.out.println(car);
        }
    }

}
