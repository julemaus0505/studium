package eu.janietz.spring.database.jdbc;

import eu.janietz.spring.database.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc-config.xml");

        JdbcCarDao carDao = context.getBean(JdbcCarDao.class);

        carDao.saveCar(
                new Car("R8", "Idua"),
                new Car("A3", "Idua")
        );

        for (Car car : carDao.findAllCars())
        {
            System.out.println(car);
        }


    }

}
