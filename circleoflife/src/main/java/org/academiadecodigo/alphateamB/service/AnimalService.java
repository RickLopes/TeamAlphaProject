package org.academiadecodigo.alphateamB.service;

import org.academiadecodigo.alphateamB.persistence.dao.AnimalDao;
import org.academiadecodigo.alphateamB.persistence.dao.UserDao;
import org.academiadecodigo.alphateamB.persistence.model.animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    private AnimalDao animalDao;
    private UserDao userDao;

    @Autowired
    public void setAnimalDao(AnimalDao animalDao) {
        this.animalDao = animalDao;
    }

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public Animal get(Integer id){
        return animalDao.findById(id);
    }

    /*

    Implments methods add
     */


}
