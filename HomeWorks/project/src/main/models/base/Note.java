package main.models.base;

import java.util.List;

/**
 * Created by Алина on 27.05.2017.
 */
abstract public class Note {
    //просто запись
    private List<String> note;

    public Note(List<String> note) {
        this.note = note;
    }

    public List<String> getNote() {
        return note;
    }

    public void setNote(List<String> note) {
        this.note = note;
    }
}
