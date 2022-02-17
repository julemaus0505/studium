package eu.janietz.spring.database.springdata;

import eu.janietz.spring.database.springdata.repository.CarRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-data-config.xml");
        CarManager manager = context.getBean(CarManager.class);

        manager.manage();
    }

}
