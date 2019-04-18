package org.academiadecodigo.alphateamB.persistence.model.animal;


import org.academiadecodigo.alphateamB.persistence.model.Model;
import org.academiadecodigo.alphateamB.persistence.model.shot.Shot;

import org.academiadecodigo.alphateamB.persistence.model.User;



import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal")
public abstract class Animal implements Model {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;

    @ManyToOne
    private User user;

    /*
    shot  list
     */
    private List<Shot> shots = new ArrayList<>();
    
    // do relashionships


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

}