package webplate.list;

import webplate.config.ListComponentConfig;

public abstract class ComponentList<E> extends CustomArrayList<E> {

    public ListComponentConfig config = new ListComponentConfig();

    abstract public void addEmpty();

    abstract public void addDefault();

}
