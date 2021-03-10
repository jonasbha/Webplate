package webplate.page.component;

import webplate.list.CustomArrayListAbstraction;
import webplate.page.Page;

public abstract class ComponentList<T> extends CustomArrayListAbstraction<T> {

    public Page page;

    abstract public T addEmpty();

    abstract public T addDefault();

    abstract public T addDefault(boolean customizable);

    abstract public void removeAll();

    abstract public void removeLast();
}
