package website.page;

import website.HTML;
import website.list.ArticleList;
import website.page.component.Article;
import website.page.component.ArticleGroup;
import website.page.component.Component;
import website.page.component.SchemaGroup;
import website.page.feature.Feature;

import java.util.ArrayList;
import java.util.LinkedList;

public class Page implements HTML {
    private String title;
    public String description;
    private String[] links;

    public Feature feature = new Feature();


    public SchemaGroup schema;
    public ArticleGroup article;

    public ArticleList<Article> articles = new ArticleList<>();

    public Page(String title) {

        schema = new SchemaGroup(this);
        article = new ArticleGroup(this);
    }


    @Override
    public String getHTML() {
        article.section.getHTML();
        return "";
    }
}
