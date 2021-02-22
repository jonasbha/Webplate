package webplate.list;

import webplate.page.PageConfig;

public abstract class ComponentList<T> extends ListNamingAbstraction<T> {

    public PageConfig config = new PageConfig();

    abstract public void addEmpty();

    abstract public void addDefault();

    abstract public void addDefault(boolean customizable);

    abstract public void removeAll();

    abstract public void removeLast();
}
