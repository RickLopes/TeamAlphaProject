package org.academiadecodigo.alphateamB.persistence.model;

import org.academiadecodigo.alphateamB.persistence.model.animal.Animal;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

public class User extends AbstractModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String password;
    private String passConfirm;

    @OneToMany(

            cascade = {CascadeType.ALL},

            orphanRemoval = true,

            mappedBy = "user",

            fetch = FetchType.EAGER
    )
    private List<Animal> animals = new ArrayList<>();

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //todo: test transient
    @Transient
    public String getPassConfirm() {
        return passConfirm;
    }

    public void setPassConfirm(String passConfirm) {
        this.passConfirm = passConfirm;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        animal.setUser(this);
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
        animal.setUser(null);
    }
}
