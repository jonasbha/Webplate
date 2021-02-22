package webplate.list;

import webplate.config.PageConfig;

public abstract class ComponentList<T> extends ListNamingAbstraction<T> {

    public PageConfig config = new PageConfig();

    abstract public void addEmpty();

    abstract public void addDefault();

    @Override
    public void removeLast() {
        removeLastItem();
        config.getParent().config.getComponents().remove(config.getParent().config.getComponents().size()-1);
    }
    @Override
    public void removeAll() {
        removeAllItems();
        config.getParent().config.getComponents().clear();
    }
}
