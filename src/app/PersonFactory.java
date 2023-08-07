package app;

import app.models.Doctor;
import app.models.Persoana;

public class PersonFactory {
    //linie-> prop pe care eu le am
    public Persoana createPerson(String persoana){
        Persoana persoana1=null;
        if("doctor".equals(persoana)){
            persoana1=new Doctor(persoana);

        }
    }
}
