package main.models.lists;

import main.models.base.Note;

import java.util.List;

/**
 * Created by Алина on 27.05.2017.
 */
public class Notes {
    private List<Note> myList;

    public Notes(List<Note> myList) {
        this.myList = myList;
    }

    public List<Note> getMyList() {
        return myList;
    }

    public void setMyList(List<Note> myList) {
        this.myList = myList;
    }
}
