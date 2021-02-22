package webplate.config;

import webplate.page.Page;
import webplate.page.component.Component;

import java.util.ArrayList;

public class PageConfig {


    private Page parent;

    public void setParent(Page parent) {
        this.parent = parent;
    }

    public Page getParent() {
        return parent;
    }

    protected ArrayList<Component> components = new ArrayList<>();

    public ArrayList<Component> getComponents() {
        return components;
    }
}
