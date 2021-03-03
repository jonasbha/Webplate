package webplate.page;

import webplate.page.component.Component;

import java.util.ArrayList;

public class PageConfig {

    protected Page parent;

    public Page getParent() {
        return parent;
    }

    protected ArrayList<Component> components = new ArrayList<>();

    public ArrayList<Component> getComponents() {
        return components;
    }
}
