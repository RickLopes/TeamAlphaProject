package org.academiadecodigo.alphateam.dao.jpa;

import org.academiadecodigo.alphateam.model.animal.Animal;
import org.springframework.stereotype.Repository;

@Repository
public class JpaAnimalDao extends GenericJpaDao<Animal> {

    public JpaAnimalDao() {
        super(Animal.class);
    }
}
