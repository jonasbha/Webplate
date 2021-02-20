package webplate.page;

import java.util.LinkedList;

public class Metadata {

    private String title;
    private String description;
    private LinkedList<String> stylesheet;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LinkedList<String> getStylesheet() {
        return stylesheet;
    }

    public void addStylesheet() {}

}
