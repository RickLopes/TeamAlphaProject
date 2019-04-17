package org.academiadecodigo.alphateam.model;

import javax.persistence.*;

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
