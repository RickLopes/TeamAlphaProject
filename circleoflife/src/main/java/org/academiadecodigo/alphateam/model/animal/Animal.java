package org.academiadecodigo.alphateam.model.animal;

import org.academiadecodigo.alphateam.model.shot.Shot;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
public abstract class Animal {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Version
    private Integer version;
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

    public int getAge() {
        return 0;
    }
}
