package website.list;

public abstract class ComponentList<E> extends ExtendedList<E> {

    public Class<E> type;

    public abstract void add();

    public abstract void add(int n);
}
