package org.academiadecodigo.alphateamB.model.shot;

import org.academiadecodigo.alphateamB.model.animal.Animal;

import java.util.Calendar;
import java.util.Date;

public class Distemper {

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
            cal.add(Calendar.WEEK_OF_YEAR, 3);
            nextVaccine = cal.getTime();
        } else {
            Calendar cal = Calendar.getInstance();
            cal.setTime(lastVaccine);
            cal.add(Calendar.YEAR, 1);
            nextVaccine = cal.getTime();
        }
        this.nextVaccine = nextVaccine;
    }


    /*
    Distemper
    At least 3 doses, given between 6 and 16 weeks of age
2 doses, given 3-4 weeks apart

     */
}
