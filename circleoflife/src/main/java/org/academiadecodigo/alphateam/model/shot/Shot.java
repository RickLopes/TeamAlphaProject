package org.academiadecodigo.alphateam.model.shot;

import java.util.Date;

public abstract class Shot {

    boolean Core = false;

    public Date firstVaccineDate;
    public Date lastVaccine;
    public Date nextVaccine;

    public Date getLastVaccine() {
        return lastVaccine;
    }

    public void setLastVaccine(Date lastVaccine) {
        this.lastVaccine = lastVaccine;
    }

    public Date getNextVaccine() {
        return nextVaccine;
    }

}
