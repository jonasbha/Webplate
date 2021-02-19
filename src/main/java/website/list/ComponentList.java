package website.list;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public abstract class ComponentList<E> extends ExtendedList<E> {

    public Class<E> type;

    public abstract void add();

    public abstract void add(int n);
}
