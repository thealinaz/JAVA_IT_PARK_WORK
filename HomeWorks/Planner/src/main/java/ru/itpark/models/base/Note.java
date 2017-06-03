package ru.itpark.models.base;

/**
 * Created by Алина on 01.06.2017.
 */
public class Note {
    private Text textOfNote;

    public Note(Text textOfNote) {
        this.textOfNote = textOfNote;
    }

    public Text getTextOfNote() {
        return textOfNote;
    }

    public void setTextOfNote(Text textOfNote) {
        this.textOfNote = textOfNote;
    }
}
