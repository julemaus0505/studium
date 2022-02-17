package eu.janietz.spring.database.config;

import eu.janietz.spring.database.hibernate.CarDao;
import eu.janietz.spring.database.hibernate.PersonDao;
import eu.janietz.spring.database.model.Adress;
import eu.janietz.spring.database.model.CarEntity;
import eu.janietz.spring.database.model.PersonEntity;
import eu.janietz.spring.database.model.WheelEntity;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class Configuration implements InitializingBean {

    @Autowired
    CarDao carDao;

    @Autowired
    PersonDao personDao;

    private List<WheelEntity> provideWheels()
    {
        return Arrays.asList(
                new WheelEntity(),
                new WheelEntity(),
                new WheelEntity(),
                new WheelEntity()
        );
    }

    private void configureDatabase()
    {
        System.out.println("Konfiguriere Datenbank..");

        // Personen anlegen


        // Autos anlegen
        CarEntity r8 = new CarEntity("R8", provideWheels());
        CarEntity m3 = new CarEntity("M3", provideWheels());

        PersonEntity personEntity = new PersonEntity("Markus", new Adress("Musterstraße", 2), Arrays.asList(r8, m3));
        personDao.save(personEntity);


        System.out.println("Konfiguration abgeschlossen");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        configureDatabase();
    }
}
