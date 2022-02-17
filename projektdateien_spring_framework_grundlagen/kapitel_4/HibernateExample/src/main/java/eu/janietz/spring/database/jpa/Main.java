package eu.janietz.spring.database.jpa;

import eu.janietz.spring.database.hibernate.CarDao;
import eu.janietz.spring.database.model.CarEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("jpa-config.xml");
        CarDao carDao = context.getBean(CarDao.class);

        for (CarEntity car : carDao.getAllCars())
        {
            System.out.println(car);
        }
    }

}
