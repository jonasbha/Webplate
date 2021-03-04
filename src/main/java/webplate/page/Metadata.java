package webplate.page;

import java.util.LinkedList;

public class Metadata {

    private String title;
    private String description;
    private String language = "en";
    private int stylesheet = 0;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

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

    public int getStylesheet() {
        return stylesheet;
    }

    public void addStylesheet() {
        stylesheet++;
    }
}
