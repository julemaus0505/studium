package eu.janietz.spring.database.springdata.repository;

import eu.janietz.spring.database.model.CarEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends CrudRepository<CarEntity, Integer> {

    public List<CarEntity> findByModel(String model);

    @Query("select c from CarEntity c join c.owners p where (p.name = :name)")
    public List<CarEntity> findByOwnerName(@Param("name")String name);

}
