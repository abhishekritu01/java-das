package collection;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class OurGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public OurGenericList() {
        size = 0;
        items = (T[]) new Object[100];

    }


    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

//    @Override
//    public void forEach(Consumer<? super T> action) {
//        Iterable.super.forEach(action);
//    }
//
//    @Override
//    public Spliterator<T> spliterator() {
//        return Iterable.super.spliterator();
//    }
}
