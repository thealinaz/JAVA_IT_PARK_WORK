package ru.itpark.models.schedule;

import java.util.Date;

/**
 * Created by Алина on 27.05.2017.
 */
public class Event {
    private Date date;

    public Event(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
