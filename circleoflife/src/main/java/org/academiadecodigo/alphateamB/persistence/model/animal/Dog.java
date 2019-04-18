package org.academiadecodigo.alphateamB.persistence.model.animal;

import org.academiadecodigo.alphateamB.persistence.model.User;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Dog extends Animal {

    private String name;
    private String birthdate;
    private SizeAnimal size;
    private String color;
    private String breed;
    private Boolean neutered;
    private double weigth;

     /*
    list shots dogs
     */

     //Core
     private String rabiesDate;
     private String distemperDate;
     private String parvovirusDate;
     private String adenovirusType1Date;
     private String adenovirusType2Date;
     private String parainfluenzaDate;

     //non-Core
     private String bordetellaDate;
     private String lymeDateDate;
     private String leptospirosisDate;
     private String canineInfluenzaDate;


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

    public String getParvovirusDate() {
        return parvovirusDate;
    }

    public void setParvovirusDate(String parvovirusDate) {
        this.parvovirusDate = parvovirusDate;
    }

    public String getAdenovirusType1Date() {
        return adenovirusType1Date;
    }

    public void setAdenovirusType1Date(String adenovirusType1Date) {
        this.adenovirusType1Date = adenovirusType1Date;
    }

    public String getAdenovirusType2Date() {
        return adenovirusType2Date;
    }

    public void setAdenovirusType2Date(String adenovirusType2Date) {
        this.adenovirusType2Date = adenovirusType2Date;
    }

    public String getParainfluenzaDate() {
        return parainfluenzaDate;
    }

    public void setParainfluenzaDate(String parainfluenzaDate) {
        this.parainfluenzaDate = parainfluenzaDate;
    }

    public String getBordetellaDate() {
        return bordetellaDate;
    }

    public void setBordetellaDate(String bordetellaDate) {
        this.bordetellaDate = bordetellaDate;
    }

    public String getLymeDateDate() {
        return lymeDateDate;
    }

    public void setLymeDateDate(String lymeDateDate) {
        this.lymeDateDate = lymeDateDate;
    }

    public String getLeptospirosisDate() {
        return leptospirosisDate;
    }

    public void setLeptospirosisDate(String leptospirosisDate) {
        this.leptospirosisDate = leptospirosisDate;
    }

    public String getCanineInfluenzaDate() {
        return canineInfluenzaDate;
    }

    public void setCanineInfluenzaDate(String canineInfluenzaDate) {
        this.canineInfluenzaDate = canineInfluenzaDate;
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
        return AnimalType.DOG;
    }
}
