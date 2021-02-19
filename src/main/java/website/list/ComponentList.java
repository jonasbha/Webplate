package website.list;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public abstract class ComponentList<E> extends ArrayList<E> {

    abstract void add();
}
