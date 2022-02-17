package eu.janietz.spring.database.jpa;

import eu.janietz.spring.database.hibernate.PersonDao;
import eu.janietz.spring.database.model.PersonEntity;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Transactional
@Repository
public class PersonDaoImpl implements PersonDao {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void save(PersonEntity... personEntity) {
        for (PersonEntity p : personEntity)
        {
            entityManager.persist(p);
        }
    }
}
