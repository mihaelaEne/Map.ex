package app.models;

import java.util.Objects;

public class Persoana implements Comparable <Persoana> {

    private String type;
    private String nume;
    private int varsta;

    public Persoana(){}
    public Persoana(String type, String nume, int varsta ) {
        this.type = type;
        this.nume = nume;
        this.varsta=varsta;
    }

    public Persoana(String prop){
        String [] split=prop.split(",");
        this.type=split[0];
        this.nume=split[1];
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "type='" + type + '\'' +
                ", nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       Persoana persoana=(Persoana) o;
       return this.nume.equals(persoana.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, nume);


    }
    @Override
    public int compareTo(Persoana o){
        if(o.varsta>this.varsta){
            return -1;
        }else if(o.varsta<this.varsta){
            return 1;
        } else {
            return 0;
        }

    }


}
