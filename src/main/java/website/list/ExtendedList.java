package website.list;

import java.util.ArrayList;

public abstract class ExtendedList<E> extends ArrayList<E> {

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
