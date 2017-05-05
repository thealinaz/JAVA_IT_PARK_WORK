package LinkedList;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {

    private Node<T> head;
    private Node<T> tail;
    private int count;

    private class Node <T> {
        private T value;

        private Node<T> next;
        Node(T value) {
            this.value = value;
        }

    }

    private class LinkedListIterator<T> implements Iterator<T> {

        Node <T> current;

        LinkedListIterator(Node<T> begin) {
            current = begin;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }
        @Override
        public T next() {
            T value = current.value;
            current = current.next;
            return value;
        }

    }

    @Override
    public Iterator<T> iterator() {
        return new LinkedListIterator<T>(head);
    }

    public LinkedList() {
        this.head = null;
        this.count = 0;
    }
    // !!! не понимаю, когда нужно использовать this.head и просто head; с tail аналогично !!!
    public void addFirst(T element) {
        Node<T> newNode = new Node<T>(element);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        count++;
    }

    public void addLast(T element) {
        Node<T> newNode = new Node<T>(element);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        count++;
    }

    public T get(int index) {
        Node<T> current = head;
        int i = 0;
        while ( i < index) {
            current = current.next;
            i++;
        }
        return current.value;
    }

    public int getCount() {
        return count;
    }
}
