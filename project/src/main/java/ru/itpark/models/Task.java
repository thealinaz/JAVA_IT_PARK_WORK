package ru.itpark.models;

import javax.persistence.*;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String time;

    @Column
    String text;

    @Column
    boolean done;

    public Task(String time, String text, boolean done) {
        this.time = time;
        this.text = text;
        this.done = done;
    }

    public Task(String time, String text) {
        this.time = time;
        this.text = text;
    }

    public Task() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
