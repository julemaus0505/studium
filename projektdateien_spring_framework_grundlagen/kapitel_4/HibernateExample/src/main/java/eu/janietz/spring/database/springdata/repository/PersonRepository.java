package eu.janietz.spring.database.springdata.repository;

import eu.janietz.spring.database.model.PersonEntity;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<PersonEntity, Integer> {
}
