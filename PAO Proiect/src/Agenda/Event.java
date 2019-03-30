package Agenda;
import javafx.util.Pair;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.Date;
public class Event {
    protected String title, type, place;
    protected Date startDate, endDate;
    Event(){
        title = null;
    }
    Event(String title){
        this.title = new String(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
class Job extends Event{
    private Pair startingHour,endingHour;//In fact pair of hour and minute
    Job(){
        startingHour = new Pair(0,0);
        type = "job";
    }
    Job(int hour, int minute) {
        startingHour = new Pair(hour,minute);
        type = "job";
    }
    Job(int hour){
        startingHour = new Pair(hour,0);
        type = "job";
    }

    public Pair getStartingHour() {
        return startingHour;
    }

    public Pair getEndingHour() {
        return endingHour;
    }

    public void setStartingHour(Pair startingHour) {
        this.startingHour = startingHour;
    }

    public void setEndingHour(Pair endingHour) {
        this.endingHour = endingHour;
    }
}
class Task extends Event{
    Task(){
        startDate = new Date();
        endDate = new Date();
        type = "Task";
    }
}
class Holyday extends Event{
    Holyday(){
        startDate = new Date();
        endDate = new Date();
        type = "Holyday";
    }
}
class Meeting extends Event{
    Meeting(){
        startDate = new Date();
        endDate = new Date();
        type = "Meeting";
    }
}

class GraphicInterface{
    private Color backgroundColor; //MAYBE COLOR TYPE!!
    private Color textColor;
    //TBD!!!
    //Do we have any color predefined objects??
}
class Planner{
    protected LocalDateTime today;
    private static final Planner planner = new Planner();
    private Planner() {
    }
    public void setDate(){
        today = LocalDateTime.now();
    }

}