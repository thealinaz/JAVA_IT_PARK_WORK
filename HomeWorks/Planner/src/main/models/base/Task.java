package main.models.base;

import main.models.base.Note;

import java.util.Date;
import java.util.List;

/**
 * Created by Алина on 27.05.2017.
 */
public class Task {
    private List<Note> task;
    private Date deadline;

    public Task(List<Note> task, Date deadline) {
        this.task = task;
        this.deadline = deadline;
    }

    public List<Note> getTask() {
        return task;
    }

    public void setTask(List<Note> task) {
        this.task = task;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
