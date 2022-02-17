package eu.janietz.spring.database.hibernate;

import eu.janietz.spring.database.model.PersonEntity;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class PersonDaoImpl implements PersonDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(PersonEntity... personEntity) {
        for (PersonEntity entity : personEntity)
        {
            sessionFactory.getCurrentSession().saveOrUpdate(entity);
        }
    }
}
