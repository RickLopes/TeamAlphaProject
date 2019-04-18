package org.academiadecodigo.alphateamB.persistence.model.shot;

import org.academiadecodigo.alphateamB.persistence.model.animal.Animal;

import java.util.Calendar;
import java.util.Date;

public class RabiesShot {

    public boolean core = true;
    private Date nextVaccine;
    private Animal pet;

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public void setNextVaccine(Date lastVaccine) {
        if (pet.getAge < 2) {
            Calendar cal = Calendar.getInstance();
            cal.setTime(lastVaccine);
            cal.add(Calendar.YEAR, 1);
            nextVaccine = cal.getTime();
        } else {
            Calendar cal = Calendar.getInstance();
            cal.setTime(lastVaccine);
            cal.add(Calendar.YEAR, 1);
            nextVaccine = cal.getTime();
        }
        this.nextVaccine = nextVaccine;
    }
    
}
