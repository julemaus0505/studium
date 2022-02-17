package eu.janietz.spring.database.hibernate;

import eu.janietz.spring.database.model.CarEntity;

import java.util.List;

public interface CarDao {

    public List<CarEntity> getAllCars();
    public CarEntity findById(int id);
    public void save(CarEntity... cars);
    public void delete(CarEntity car);

}
