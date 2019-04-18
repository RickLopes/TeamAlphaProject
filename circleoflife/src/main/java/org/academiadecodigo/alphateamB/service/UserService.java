package org.academiadecodigo.alphateamB.service;

import org.academiadecodigo.alphateamB.exceptions.AnimalNotFoundException;
import org.academiadecodigo.alphateamB.exceptions.AssociationExistsException;
import org.academiadecodigo.alphateamB.exceptions.UserNotFoundException;
import org.academiadecodigo.alphateamB.persistence.dao.AnimalDao;
import org.academiadecodigo.alphateamB.persistence.dao.UserDao;
import org.academiadecodigo.alphateamB.persistence.model.User;
import org.academiadecodigo.alphateamB.persistence.model.animal.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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


    public User get(Integer id) {
        return userDao.findById(id);
    }

    @Transactional
    public User save(User customer) {
        return userDao.saveOrUpdate(customer);
    }

    @Transactional
    public void delete(Integer id) throws UserNotFoundException, AssociationExistsException {

        User user = userDao.findById(id);

        if (user == null) {
            throw new UserNotFoundException();
        }

        if (!user.getAnimals().isEmpty()) {
            throw new AssociationExistsException();
        }

        userDao.delete(id);
    }

    public List<User> list() {
        return userDao.findAll();
    }

    @Transactional
    public Animal addAnimal(Integer id, Animal animal) throws UserNotFoundException {

        User user = userDao.findById(id);
        if (user == null) {
            throw new UserNotFoundException();
        }

        user.addAnimal(animal);
        userDao.saveOrUpdate(user);

        return user.getAnimals().get(user.getAnimals().size() - 1);
    }

    @Transactional
    public void closeAnimal(Integer id, Integer animalId)
            throws UserNotFoundException, AnimalNotFoundException {

        User user = userDao.findById(id);
        Animal animal = animalDao.findById(animalId);

        if (user == null) {
            throw new UserNotFoundException();
        }

        if (animal == null || !animal.getUser().getId().equals(id)) {
            throw new AnimalNotFoundException();
        }

        //different from 0 in case we later decide that negative values are acceptable

        user.removeAnimal(animal);
        userDao.saveOrUpdate(user);
    }

    private Set<Integer> getAnimalIds(User user) {
        Set<Integer> animalIds = new HashSet<>();
        List<Animal> animals = user.getAnimals();

        for (Animal animal : animals) {
            animalIds.add(animal.getId());
        }
        return animalIds;
    }

}
