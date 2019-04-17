package org.academiadecodigo.alphateam.shot;

import org.academiadecodigo.alphateam.model.Animal;

public class RabiesShot {

    private Animal pet;
    public boolean Core = true;

    public String lastVaccine;              //date
    public String nextVaccineBaby;          //date
    public String nextVaccineAdult;         //date


    //dog - first and second year, then every three
    //cat - 2 doses (12 months apart), then every 3


    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public String getLastVaccine() {
        return lastVaccine;
    }

    public void setLastVaccine(String lastVaccine) {
        this.lastVaccine = lastVaccine;
    }

    public String getNextVaccineBaby() {
        return nextVaccineBaby;
    }

    public void setNextVaccineBaby(String lastVaccine) {
        if (pet.getAge > 2)

        this.nextVaccine = nextVaccine;
    }

}
