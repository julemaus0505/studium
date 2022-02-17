package eu.janietz.spring.database.springdata;

import eu.janietz.spring.database.model.CarEntity;
import eu.janietz.spring.database.springdata.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class CarManager {

    @Autowired
    CarRepository repository;

    public void manage()
    {
        System.out.println("Finding Car by Model Name: R8");
        for (CarEntity carEntity : repository.findByModel("R8"))
        {
            System.out.println(carEntity);
        }

        System.out.println("Finding Cars of Owner: Markus");
        for (CarEntity carEntity : repository.findByOwnerName("Markus"))
        {
            System.out.println(carEntity);
        }
    }

}
