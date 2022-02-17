package eu.janietz.spring.database.hibernate;

import eu.janietz.spring.database.model.CarEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SuppressWarnings("JpaQueryApiInspection")
@Transactional
@Repository("carDao")
public class CarDaoImpl implements CarDao {

    @Autowired
    private SessionFactory factory;


    @Override
    @Transactional(readOnly = true)
    public List<CarEntity> getAllCars() {
        return factory.getCurrentSession().getNamedQuery("CarEntity.getAllCars").list();
    }

    @Override
    @Transactional(readOnly = true)
    public CarEntity findById(int id) {
        return (CarEntity) factory.getCurrentSession().getNamedQuery("CarEntity.getById").setParameter("id", id).uniqueResult();
    }

    @Override
    public void save(CarEntity... cars) {
        for (CarEntity carEntity : cars)
        {
            factory.getCurrentSession().saveOrUpdate(carEntity);
        }
    }

    @Override
    public void delete(CarEntity car) {
        factory.getCurrentSession().delete(car);
    }
}
