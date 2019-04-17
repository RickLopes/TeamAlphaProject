package org.academiadecodigo.alphateamB.dao.jpa;

import org.academiadecodigo.alphateamB.model.animal.Animal;
import org.springframework.stereotype.Repository;

@Repository
public class JpaAnimalDao extends GenericJpaDao<Animal> {

    public JpaAnimalDao() {
        super(Animal.class);
    }
}
