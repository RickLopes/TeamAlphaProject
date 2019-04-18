package org.academiadecodigo.alphateamB.service;

import org.academiadecodigo.alphateamB.persistence.dao.AnimalDao;
import org.academiadecodigo.alphateamB.persistence.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

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


}
