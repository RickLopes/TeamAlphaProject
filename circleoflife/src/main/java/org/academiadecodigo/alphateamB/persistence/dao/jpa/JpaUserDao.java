package org.academiadecodigo.alphateamB.persistence.dao.jpa;

import org.academiadecodigo.alphateamB.persistence.model.User;

public class JpaUserDao extends GenericJpaDao<User> {
    public JpaUserDao() {
        super(User.class);
    }
}
