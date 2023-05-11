package MiniExercises.models;

import java.sql.Date;
import java.sql.Time;

/**
 * Create a class Call to hold a call performed through a GSM. It should contain
 * date, time, dialed phone number and duration (in seconds).
 */
public class Call {
    private Date date;
    private Time time;
    private String dialedNumber;
    private int duration;

    public Call() {
    }

    public Call(Date date, Time time, String dialedNumber, int duration) {
        this.date = date;
        this.time = time;
        this.dialedNumber = dialedNumber;
        this.duration = duration;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getDialedNumber() {
        return dialedNumber;
    }

    public void setDialedNumber(String dialedNumber) {
        this.dialedNumber = dialedNumber;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        Call call = (Call) obj;
        return this.date.equals(call.getDate()) && this.time.equals(call.getTime())
                && this.dialedNumber.equals(call.getDialedNumber()) && this.duration == call.duration;
    }

    @Override
    public String toString() {
        return "Call [date=" + date + ", time=" + time + ", dialedNumber=" + dialedNumber + ", duration=" + duration
                + "]";
    }

}
