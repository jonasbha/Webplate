package website.page;

import website.HTML;
import website.page.component.ArticleGroup;
import website.page.component.Component;
import website.page.component.SchemaGroup;
import website.page.feature.Feature;

import java.util.LinkedList;

public class Page implements HTML {
    private String title;
    private String description;
    private String[] links;
    public LinkedList<Component> components;
    public Feature feature = new Feature();
    public SchemaGroup schema;
    public ArticleGroup article;

    public Page(String title) {

        schema = new SchemaGroup(this);
        article = new ArticleGroup(this);
    }

    @Override
    public String getHTML() {
        components.get(1).getHTML();
        return "";
    }
}
