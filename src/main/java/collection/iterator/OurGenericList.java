package collection.iterator;

import java.util.Iterator;


public class OurGenericList<T> implements Iterable<T> {

    private T[] items;
    private int size;

    public OurGenericList() {
        items = (T[]) new Object[10];
        size = 0;
    }

    public void add(T item) {
        items[size++] = item;
    }

    public T getItemAtIndex(int index) {
        return items[index];
    }



    @Override
    public Iterator<T> iterator() {
        return new OurGenericListIterator(this);
    }

    private class OurGenericListIterator implements Iterator<T> {

        private OurGenericList<T> list;
        private int index= 0;

        public OurGenericListIterator(OurGenericList<T> list) {
            this.list = list;
//            index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
//            return list.getItemAtIndex(index++);
            return list.items[index++];
        }
    }
}





