package main.models.schedule;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.Duration;
import java.util.Date;

/**
 * Created by Алина on 27.05.2017.
 */
public class Event {
    private Date date;
    private DayOfWeek dayOfWeek;
    private Duration duration;
    private Clock clock;

    public Event(Date date, DayOfWeek dayOfWeek, Duration duration, Clock clock) {
        this.date = date;
        this.dayOfWeek = dayOfWeek;
        this.duration = duration;
        this.clock = clock;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Clock getClock() {
        return clock;
    }

    public void setClock(Clock clock) {
        this.clock = clock;
    }
}
