package org.academiadecodigo.alphateamB.service;

import org.academiadecodigo.alphateamB.dao.AnimalDao;
import org.academiadecodigo.alphateamB.dao.UserDao;
import org.academiadecodigo.alphateamB.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl {

    private UserDao userDao;
    private AnimalDao animalDao;

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Autowired
    public void setAnimalDao(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    public User get()

}
