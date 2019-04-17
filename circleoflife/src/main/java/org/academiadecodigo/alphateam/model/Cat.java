package org.academiadecodigo.alphateam.model;


import org.academiadecodigo.alphateam.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Cat extends Animal {

    private String name;
    private String birthdate;
    private SizeAnimal size = SizeAnimal.SMALL;
    private String color;
    private String breed;
    private double weigth;
     /*
    list shots cats
     */

     //Core
    private String rabiesDate;
    private String distemperDate;
    private String herpesvirusDate;
    private String calicivirusDate;

    //non-Core
    private String felineLeukemiaVirusDate;
    private String bordetellaDate;

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

    public String getRabiesDate() {
        return rabiesDate;
    }

    public void setRabiesDate(String rabiesDate) {
        this.rabiesDate = rabiesDate;
    }

    public String getDistemperDate() {
        return distemperDate;
    }

    public void setDistemperDate(String distemperDate) {
        this.distemperDate = distemperDate;
    }

    public String getHerpesvirusDate() {
        return herpesvirusDate;
    }

    public void setHerpesvirusDate(String herpesvirusDate) {
        this.herpesvirusDate = herpesvirusDate;
    }

    public String getCalicivirusDate() {
        return calicivirusDate;
    }

    public void setCalicivirusDate(String calicivirusDate) {
        this.calicivirusDate = calicivirusDate;
    }

    public String getFelineLeukemiaVirusDate() {
        return felineLeukemiaVirusDate;
    }

    public void setFelineLeukemiaVirusDate(String felineLeukemiaVirusDate) {
        this.felineLeukemiaVirusDate = felineLeukemiaVirusDate;
    }

    public String getBordetellaDate() {
        return bordetellaDate;
    }

    public void setBordetellaDate(String bordetellaDate) {
        this.bordetellaDate = bordetellaDate;
    }
}
