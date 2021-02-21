package webplate.config;

import webplate.page.Page;

public class ListComponentConfig {

    private Page parent;

    public void setParent(Page parent) {
        this.parent = parent;
    }

    public Page getParent() {
        return parent;
    }
}
