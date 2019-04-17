package org.academiadecodigo.alphateam.model;

import org.academiadecodigo.alphateam.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Dog extends Animal {

    private String name;
    private String birthdate;
    private SizeAnimal size;
    private String color;
    private double weigth;

     /*
    list shots dogs
     */
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
