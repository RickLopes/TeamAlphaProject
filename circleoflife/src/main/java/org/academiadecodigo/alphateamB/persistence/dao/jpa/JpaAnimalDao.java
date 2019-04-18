package org.academiadecodigo.alphateamB.persistence.dao.jpa;

import org.academiadecodigo.alphateamB.persistence.model.animal.Animal;
import org.springframework.stereotype.Repository;

@Repository
public class JpaAnimalDao extends GenericJpaDao<Animal> {

    public JpaAnimalDao() {
        super(Animal.class);
    }
}
