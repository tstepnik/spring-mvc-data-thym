package pl.javastart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;

@Entity
public class TimeData {

    @Id
    @GeneratedValue
    private long Id;
    private String firstName;
    private String lastName;
    private int hours;
    private int minutes;
    private int seconds;

    public TimeData(){}

    public TimeData(String firstName,String lastName,int hours, int minutes, int seconds){
        this.firstName=firstName;
        this.lastName=lastName;
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
}
