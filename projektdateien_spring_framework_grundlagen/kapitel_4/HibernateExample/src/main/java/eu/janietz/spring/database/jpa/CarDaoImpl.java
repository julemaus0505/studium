package eu.janietz.spring.database.jpa;

import eu.janietz.spring.database.hibernate.CarDao;
import eu.janietz.spring.database.model.CarEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Transactional
@Repository
public class CarDaoImpl implements CarDao {

    @PersistenceContext
    EntityManager entityManager;


    @Override
    @Transactional(readOnly = true)
    public List<CarEntity> getAllCars() {
        return entityManager.createNamedQuery("CarEntity.getAllCars").getResultList();
    }

    @Override
    public CarEntity findById(int id) {
        return null;
    }

    @Override
    public void save(CarEntity... cars) {
        for (CarEntity entity : cars)
        {
            entityManager.merge(entity);
        }
    }

    @Override
    public void delete(CarEntity car) {

    }
}
