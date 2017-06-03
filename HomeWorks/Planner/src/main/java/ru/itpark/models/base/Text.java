package ru.itpark.models.base;

/**
 * Created by Алина on 01.06.2017.
 */
public abstract class Text {
    private int numberOfSymbols;
    private char[] text = new char[numberOfSymbols];

    public Text(int numberOfSymbols, char[] text) {
        this.numberOfSymbols = numberOfSymbols;
        this.text = text;
    }

    public Text(char[] text) {
        this.numberOfSymbols = 300;
        this.text = text;
    }

    public int getNumberOfSymbols() {
        return numberOfSymbols;
    }

    public void setNumberOfSymbols(int numberOfSymbols) {
        this.numberOfSymbols = numberOfSymbols;
    }

    public char[] getText() {
        return text;
    }

    public void setText(char[] text) {
        this.text = text;
    }
}
