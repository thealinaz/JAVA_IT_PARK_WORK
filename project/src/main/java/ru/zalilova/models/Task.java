package ru.zalilova.models;

import javax.persistence.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String text;

    @Column
    private String time;

    public Task() {
    }

    public Task(String text, String time) {
        if (text != "") {
            this.text = text;
        } else {
            this.text = "Задача";
        }
        Pattern p = Pattern.compile("^(([0,1][0-9])|(2[0-3])):[0-5][0-9]$");
        Matcher m = p.matcher(time);
        if (m.matches()) {
            this.time = time;
        } else {
            this.time = "00:00";
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
