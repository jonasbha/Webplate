package webplate.page;

public class Metadata {

    private String title;
    private String description;
    private int stylesheet = 0;

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
