package org.academiadecodigo.alphateam.model.animal;

import org.academiadecodigo.alphateam.model.User;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "animal")
public abstract class Animal {


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
