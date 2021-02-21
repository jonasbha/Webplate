package webplate.config;

import webplate.page.Page;

public class ListComponentConfig {

    private Page parent;
    private static int position = 1;


    public void setParent(Page parent) {
        this.parent = parent;
    }

    public Page getParent() {
        return parent;
    }

    public void incrementPosition() {
        position++;
    }

    public void decrementPosition() {
        position--;
    }

    public int getPosition() {
        return position;
    }
}
