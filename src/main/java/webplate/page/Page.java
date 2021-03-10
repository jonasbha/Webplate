package webplate.page;

import webplate.list.ArrayListExtension;
import webplate.page.component.article.ArticleList;
import webplate.page.component.schema.SchemaList;
import webplate.page.component.Component;
import webplate.page.feature.Feature;

import java.util.ArrayList;

public class Page  {

    public Metadata Metadata = new Metadata();
    public Feature Feature = new Feature();
    public ArticleList Article = new ArticleList();
    public SchemaList Schema = new SchemaList();
    public Page.Config Config = new Config();

    public Page(String title) {
        Metadata.setTitle(title);
        Schema.page = this;
        Article.page = this;
    }

    public Page(String title, String description) {
        Metadata.setTitle(title);
        Metadata.setDescription(description);
        Schema.page = this;
        Article.page = this;
    }

    public Page() {
        Schema.page = this;
        Article.page = this;
    }

    public static class Config {

        protected ArrayListExtension<Component> components = new ArrayListExtension<>();

        public ArrayList<Component> getComponents() {
            return components;
        }
    }
}
