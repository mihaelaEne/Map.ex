package app.models;

import java.util.Objects;

public class Doctor extends Persoana{

    private String specializare;
    private int aniExperienta;


    public Doctor(String type, String nume, int varsta) {
        super(type, nume, varsta);
    }

    public Doctor(String type, String nume, int varsta, String specializare, int aniExperienta) {
        super(type, nume, varsta);
        this.specializare = specializare;
        this.aniExperienta = aniExperienta;
    }

    public Doctor(String prop){
        String [] split=prop.split(",");
        this.specializare=split[2];
        this.aniExperienta=Integer.parseInt(split[3]);
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public void setAniExperienta(int aniExperienta) {
        this.aniExperienta = aniExperienta;
    }

    @Override
    public String toString() {
       String text="";
       text+="nume: "+super.getNume()+"\n";
       text+="varsta: "+super.getVarsta()+"\n";
       text+="specializare: "+this.specializare+"\n";
       text+="ani experienta: "+this.aniExperienta+"\n";
       return text;
    }


    @Override
    public boolean equals(Object o) {
       Doctor doctor=(Doctor) o;
       return this.specializare.equals(doctor.specializare)&&this.aniExperienta==doctor.aniExperienta;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specializare, aniExperienta);
    }



    @Override
    public int compareTo(Persoana o) {
        Doctor doc=(Doctor) o;
        if(doc.aniExperienta>this.aniExperienta){
            return -1;
        }else if(doc.aniExperienta<this.aniExperienta){
            return 1;
        }else{
            return 0;
        }
    }
}
