package org.academiadecodigo.alphateamB.persistence.model.animal;


import org.academiadecodigo.alphateamB.persistence.model.AbstractModel;
import org.academiadecodigo.alphateamB.persistence.model.User;
import javax.persistence.*;


@Entity(name="AnimalSingleTable")
@Table(name="animal")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Animal extends AbstractModel {

    @ManyToOne
    private User owner;

    /*
    shot  list
     */

    //private List<Shot> shots = new ArrayList<>();
    
    // do relashionships



    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    /*public List<Shot> getShots() {
        return shots;
    }

    public void setShots(List<Shot> shots) {
        this.shots = shots;
    }*/


    public abstract AnimalType getAnimalType();
}
