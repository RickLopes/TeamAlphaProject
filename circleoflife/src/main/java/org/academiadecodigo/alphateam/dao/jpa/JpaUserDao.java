package org.academiadecodigo.alphateam.dao.jpa;

import org.academiadecodigo.alphateam.model.User;

public class JpaUserDao extends GenericJpaDao<User> {
    public JpaUserDao() {
        super(User.class);
    }
}
