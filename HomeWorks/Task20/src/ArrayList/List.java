package ArrayList;

public interface List<T> {

    void add(T element);
    void addFirst(T element);
    void insert(T element, int index);
    void delete(int index);
    void delete(T element);
    void reverse();
    T get(int index);
    int size();
    boolean isEmpty();
}
