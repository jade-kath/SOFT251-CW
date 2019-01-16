/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author jade_
 */
public class Appointment {
    
    private LocalDateTime AppStartTime;
    private LocalDateTime AppFinishTime;
    private Long AppDurationTime;
    private Doctor doctor;
    private String DoctorsNotes;
    private Patient patient;
    private String PatientsNotes;
    private boolean AppFinished = false;

    /**
     * Receives the start time of an appointment
     * @return
     */
    public LocalDateTime getAppStartTime() {
        return AppStartTime;
    }

    /**
     * sets the start time of the appointment
     * @param AppStartTime
     */
    public void setAppStartTime(LocalDateTime AppStartTime) {
        this.AppStartTime = AppStartTime;
    }

    /**
     * receives the finish time of an appointment
     * @return
     */
    public LocalDateTime getAppFinishTime() {
        return AppFinishTime;
    }

    /**
     * sets the finish time of an appointment
     * @param AppFinishTime
     */
    public void setAppFinishTime(LocalDateTime AppFinishTime) {
        this.AppFinishTime = AppFinishTime;
    }

    /**
     * receives the duration of an appointment
     * @return
     */
    public Long getAppDurationTime() {
        return AppDurationTime;
    }

    /**
     * sets the duration time by calculating the difference between the start and finish time
     * @param AppDurationTime
     */
    public void setAppDurationTime(Long AppDurationTime) {
        AppDurationTime = null;
        AppDurationTime = AppStartTime.until(AppFinishTime, ChronoUnit.MINUTES);
    }

    /**
     * receives the doctor to link to the appointment
     * @return
     */
    public Doctor getDoctor() {
        return doctor;
    }

    /**
     * sets the doctor to an appointment
     * @param doctor
     */
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    /**
     * receives doctors notes 
     * @return
     */
    public String getDoctorsNotes() {
        return DoctorsNotes;
    }

    /**
     * sets doctors notes
     * @param DoctorsNotes
     */
    public void setDoctorsNotes(String DoctorsNotes) {
        this.DoctorsNotes = DoctorsNotes;
    }

    /**
     * receives patient to link with the appointment
     * @return
     */
    public Patient getPatient() {
        return patient;
    }

    /**
     * sets patient to the appointment
     * @param patient
     */
    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    /**
     * receives patients notes on why the appointment is needed
     * @return
     */
    public String getPatientsNotes() {
        return PatientsNotes;
    }

    /**
     * sets patient notes on why the appointment is needed
     * @param PatientsNotes
     */
    public void setPatientsNotes(String PatientsNotes) {
        this.PatientsNotes = PatientsNotes;
    }

    /**
     * shows if the appointment was completed/passed
     * @return
     */
    public boolean isAppFinished() {
        return AppFinished;
    }

    /**
     * sets if the appointment was completed
     * @param AppFinished
     */
    public void setAppFinished(boolean AppFinished) {
        this.AppFinished = AppFinished;
    }
    
    
}


