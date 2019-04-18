package org.academiadecodigo.alphateamB.persistence.model.animal;


import org.academiadecodigo.alphateamB.persistence.model.AbstractModel;
import org.academiadecodigo.alphateamB.persistence.model.Model;
import org.academiadecodigo.alphateamB.persistence.model.shot.Shot;

import org.academiadecodigo.alphateamB.persistence.model.User;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal")
public abstract class Animal extends AbstractModel {

    @ManyToOne
    private User user;

    /*
    shot  list
     */
    private List<Shot> shots = new ArrayList<>();
    
    // do relashionships


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Shot> getShots() {
        return shots;
    }

    public void setShots(List<Shot> shots) {
        this.shots = shots;
    }

    public abstract AnimalType getAnimalType();
}
