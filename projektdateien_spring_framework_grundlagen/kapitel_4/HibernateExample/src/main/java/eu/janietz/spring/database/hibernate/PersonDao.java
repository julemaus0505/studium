package eu.janietz.spring.database.hibernate;

import eu.janietz.spring.database.model.PersonEntity;

public interface PersonDao {

    public void save(PersonEntity... personEntity);
    
}
