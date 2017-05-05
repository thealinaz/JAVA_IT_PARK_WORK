package ArrayList;

import java.util.Iterator;

public class ArrayList<T> implements Iterable<T>, List<T> {
    private final int MAX_SIZE = 10;

    private Object elements[];
    private int count;

    private class ArrayListIterator implements Iterator<T> {

        private int currentIndex;

        ArrayListIterator(int beginIndex) {
            currentIndex = beginIndex;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < count;
        }

        @Override
        public T next() {
            T value = (T) elements[currentIndex];
            currentIndex++;
            return value;
        }
    }

    public ArrayList() {
        this.elements = new Object[MAX_SIZE];
        this.count = 0;
    }

    @Override
    public void add(T element) {
        checkRange();
        this.elements[count] = element;
        count++;
    }

    @Override
    public void addFirst(T element) {
        checkRange();
        for (int i = count; i > 0; i--)
            elements[i] = elements[i - 1];
        elements[0] = element;
        count++;
    }

    @Override
    public void insert(T element, int index) {
        checkRange();
        for (int i = count + 1; i > index; i--)
            elements[i] = elements[i - 1];
        elements[index] = element;
        count++;
    }

    @Override
    public void delete(int index) {
        elements[index] = null;
        for (int i = count - 1; i > index; i--)
            elements[i] = elements[i + 1];
        count--;
    }

    @Override
    public void delete(T element) {
        for (int i = 0; i < count; i++)
            if (element.equals(elements[i]))
                delete(i);
    }

    @Override
    public void reverse() {
        Object help = new Object();
        for (int i = 0; i < count / 2; i++) {
            help = elements[i];
            elements[i] = elements[count - i - 1];
            elements[count - i - 1] = help;
        }
    }

    @Override
    public T get(int index) {
        return (T) this.elements[index];
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    private void checkRange() {
        if (count >= MAX_SIZE) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator(0);
    }
}
