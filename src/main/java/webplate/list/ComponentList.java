package webplate.list;

import webplate.page.component.Component;

public abstract class ComponentList<E> extends ExtendedList<E> {

    abstract public void addEmpty();

    abstract public void addEmpty(int n);

    abstract public void addDefault();

    abstract public void addDefault(int n);
}
