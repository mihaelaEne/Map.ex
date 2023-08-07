package app.models;

import java.nio.file.attribute.UserPrincipalLookupService;
import java.util.Objects;

public class Programare implements Comparable<Programare> {
    private int idProgramare;
    private String pacientProgramare;
    private String doctorProgramt;

    public Programare(int idProgramare, String pacientProgramare, String doctorProgramt) {
        this.idProgramare = idProgramare;
        this.pacientProgramare = pacientProgramare;
        this.doctorProgramt = doctorProgramt;
    }
    
    public Programare(String prop){
        String [] split=prop.split(",");
        this.idProgramare=Integer.parseInt(split[0]);
        this.pacientProgramare=split[1];
        this.doctorProgramt=split[2];
    }

    public int getIdProgramare() {
        return idProgramare;
    }

    public void setIdProgramare(int idProgramare) {
        this.idProgramare = idProgramare;
    }

    public String getPacientProgramare() {
        return pacientProgramare;
    }

    public void setPacientProgramare(String pacientProgramare) {
        this.pacientProgramare = pacientProgramare;
    }

    public String getDoctorProgramt() {
        return doctorProgramt;
    }

    public void setDoctorProgramt(String doctorProgramt) {
        this.doctorProgramt = doctorProgramt;
    }

    @Override
    public String toString() {
        return "Programare{" +
                "idProgramare=" + idProgramare +
                ", pacientProgramare='" + pacientProgramare + '\'' +
                ", doctorProgramt='" + doctorProgramt + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Programare programare=(Programare) o;
        return (this.idProgramare == programare.idProgramare && this.pacientProgramare.equals(programare.pacientProgramare)&& this.doctorProgramt.equals(programare.doctorProgramt));

    }

    @Override
    public int hashCode() {
        return Objects.hash(idProgramare, pacientProgramare, doctorProgramt);
    }


    @Override
    public int compareTo(Programare o){
        if(o.idProgramare>this.idProgramare){
            return -1;
        }else if(o.idProgramare<this.idProgramare){
            return 1;
        }else return 0;
    }
}
