package webplate.list;

import webplate.page.PageConfig;

public abstract class ComponentList<T> extends ListNamingAbstraction<T> {

    public PageConfig config = new PageConfig();

    abstract public T addEmpty();

    abstract public T addDefault();

    abstract public T addDefault(boolean customizable);

    abstract public void removeAll();

    abstract public void removeLast();
}
