package org.academiadecodigo.alphateamB.persistence.dao.jpa;

import org.academiadecodigo.alphateamB.persistence.dao.AnimalDao;
import org.academiadecodigo.alphateamB.persistence.dao.UserDao;
import org.academiadecodigo.alphateamB.persistence.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenericJpaDao<User> implements UserDao {
    public JpaUserDao() {
        super(User.class);
    }
}
