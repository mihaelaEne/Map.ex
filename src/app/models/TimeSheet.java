package app.models;

public class TimeSheet {

     private int doctorId;
     private int pacientId;
     private int timeShitId;

     public TimeSheet(int doctorId, int pacientId, int timeShitId) {
          this.doctorId = doctorId;
          this.pacientId = pacientId;
          this.timeShitId = timeShitId;
     }

     public int getDoctorId() {
          return doctorId;
     }

     public void setDoctorId(int doctorId) {
          this.doctorId = doctorId;
     }

     public int getPacientId() {
          return pacientId;
     }

     public void setPacientId(int pacientId) {
          this.pacientId = pacientId;
     }

     public int getTimeShitId() {
          return timeShitId;
     }

     public void setTimeShitId(int timeShitId) {
          this.timeShitId = timeShitId;
     }


}
