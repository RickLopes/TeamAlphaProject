package org.academiadecodigo.alphateam.model.animal;


import org.academiadecodigo.alphateam.model.User;
import org.academiadecodigo.alphateam.model.shot.CatShots;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cat extends Animal {

    private String name;
    private String birthdate;
    private SizeAnimal size = SizeAnimal.SMALL;
    private String color;
    private double weigth;

     /*
    list shots cats
     */
     private List<CatShots> catShots = new ArrayList<>();


    @ManyToOne
    private User user;


     /*
     do realashionships
      */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public SizeAnimal getSize() {
        return size;
    }

    public void setSize(SizeAnimal size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
}
