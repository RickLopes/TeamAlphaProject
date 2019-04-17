package org.academiadecodigo.alphateamB.dao.jpa;

import org.academiadecodigo.alphateamB.model.User;

public class JpaUserDao extends GenericJpaDao<User> {
    public JpaUserDao() {
        super(User.class);
    }
}
