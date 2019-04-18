package org.academiadecodigo.alphateamB.persistence.model.animal;


import org.academiadecodigo.alphateamB.persistence.model.User;
import org.academiadecodigo.alphateamB.persistence.model.shot.CatShots;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("cat")
public class Cat extends Animal {

    private String name;
    private String birthdate;
    private SizeAnimal size = SizeAnimal.SMALL;
    private String color;
    private String breed;
    private Boolean neutered;
    private double weigth;

     /*
    list shots cats
     */
   //  private List<CatShots> catShots = new ArrayList<>();

     //Core
    private String rabiesDate;
    private String distemperDate;
    private String herpesvirusDate;
    private String calicivirusDate;

    //non-Core
    private String felineLeukemiaVirusDate;
    private String bordetellaDate;


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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Boolean getNeutered() {
        return neutered;
    }

    public void setNeutered(Boolean neutered) {
        this.neutered = neutered;
    }

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.CAT;
    }
}
