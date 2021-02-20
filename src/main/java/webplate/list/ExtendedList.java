package webplate.list;

import webplate.config.ListConfig;

import java.util.ArrayList;

public abstract class ExtendedList<E> extends ArrayList<E> {

    public ListConfig config = new ListConfig();

    public void removeLast() {
        remove(size()-1);
    }

    public void removeAll() { this.clear();}

    public E getLast() {
        return this.get(size()-1);
    }

    public E getFirst() {
        return this.get(0);
    }

}
