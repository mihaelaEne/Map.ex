package app.models;

import java.util.Objects;

public class Pacient extends Persoana{

    private String afectiune;
    private String specializareAfectiune;

    public Pacient(String afectiune, String specializareAfectiune) {
        this.afectiune = afectiune;
        this.specializareAfectiune = specializareAfectiune;
    }

    public Pacient(String type, String nume, int varsta, String afectiune, String specializareAfectiune) {
        super(type, nume, varsta);
        this.afectiune = afectiune;
        this.specializareAfectiune = specializareAfectiune;
    }

    public Pacient(String prop){
        String [] split=prop.split(",");
        this.afectiune=split[2];
        this.specializareAfectiune=split[3];
    }

    @Override
    public String toString(){
        String text="";
        text+="nume: "+super.getNume()+"\n";
        text+="varsta: "+super.getVarsta()+"\n";
        text+="afectiune: "+this.afectiune+"\n";
        text+="specializareAfectiune: "+this.specializareAfectiune+"\n";
        return text;
    }

    @Override
    public boolean equals(Object o) {
        Pacient pacient=(Pacient) o;
        return this.afectiune.equals(pacient.afectiune)&&this.specializareAfectiune.equals(pacient.specializareAfectiune);

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), afectiune, specializareAfectiune);
    }


    @Override
    public int compareTo(Persoana o){
        Pacient pacient=(Pacient) o;
        if(pacient.afectiune.compareTo(this.afectiune)>0){
            return 1;
        }else if (pacient.afectiune.compareTo(this.afectiune)<0){
            return -1;
        }else return 0;
    }
}
