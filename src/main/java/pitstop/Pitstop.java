package pitstop;

import java.time.OffsetDateTime;

public class Pitstop {
    private int sessionKey;
    private int meetingKey;
    private OffsetDateTime date;
    private int driverNumber;
    private double pitDuration;
    private int lapNumber;

    public Pitstop(int sessionKey, int meetingKey, OffsetDateTime date, int driverNumber, double pitDuration, int lapNumber) {
        this.sessionKey = sessionKey;
        this.meetingKey = meetingKey;
        this.date = date;
        this.driverNumber = driverNumber;
        this.pitDuration = pitDuration;
        this.lapNumber = lapNumber;
    }

    public int getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(int sessionKey) {
        this.sessionKey = sessionKey;
    }

    public int getMeetingKey() {
        return meetingKey;
    }

    public void setMeetingKey(int meetingKey) {
        this.meetingKey = meetingKey;
    }

    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public int getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(int driverNumber) {
        this.driverNumber = driverNumber;
    }

    public double getPitDuration() {
        return pitDuration;
    }

    public void setPitDuration(double pitDuration) {
        this.pitDuration = pitDuration;
    }

    public int getLapNumber() {
        return lapNumber;
    }

    public void setLapNumber(int lapNumber) {
        this.lapNumber = lapNumber;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("SessionKey: " + sessionKey + "\n");
        sb.append("MeetingKey: " + meetingKey + "\n");
        sb.append("Date: " + date + "\n");
        sb.append("Driver Number: " + driverNumber + "\n");
        sb.append("Pit Duration: " + pitDuration + "\n");
        sb.append("Lap Number: " + lapNumber + "\n");


        return "pitstop.Pitstop{" +
                "sessionKey=" + sessionKey +
                ", meetingKey=" + meetingKey +
                ", date=" + date +
                ", driverNumber=" + driverNumber +
                ", pitDuration=" + pitDuration +
                ", lapNumber=" + lapNumber +
                '}';
    }
}