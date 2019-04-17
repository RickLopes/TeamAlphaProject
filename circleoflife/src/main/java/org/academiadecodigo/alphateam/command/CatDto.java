package org.academiadecodigo.alphateam.command;

import org.academiadecodigo.alphateam.model.User;
import org.academiadecodigo.alphateam.model.animal.SizeAnimal;
import org.academiadecodigo.alphateam.model.shot.CatShots;

import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class CatDto {

    @NotNull(message = "Name is mandatory")
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 64)
    private String name;

    @NotNull(message = "Birthdate is mandatory")
    @NotBlank(message = "Birthdate is mandatory")
    private String birthdate;

    @NotBlank(message = "Birthdate is mandatory")
    private SizeAnimal size;

    @NotNull(message = "Color is mandatory")
    @NotBlank(message = "Color is mandatory")
    private String color;

    @NotNull(message = "Weigth is mandatory")
    @NotBlank(message = "Weigth is mandatory")
    private double weigth;


    /*
   list shots cats
    */
    private List<CatShots> catShots = new ArrayList<>();

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
    list shots cats
     */

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
}
