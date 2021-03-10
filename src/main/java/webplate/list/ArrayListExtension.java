package webplate.list;

import java.util.ArrayList;

public class ArrayListExtension<T> extends ArrayList<T> {
    public T getLast() {
        return get(size()-1);
    };
}
