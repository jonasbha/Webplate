package website.page;

import website.list.ArticleList;
import website.list.SchemaList;
import website.page.component.Article;
import website.page.component.Schema;
import website.page.feature.Feature;

import java.util.LinkedList;

public class Page  {

    public Meta meta = new Meta();

    public Feature feature = new Feature();
    public ArticleList<Article> article = new ArticleList<>();
    public SchemaList<Schema> schema = new SchemaList<>();

    public Page(String title) {
        meta.setTitle(title);
    }

    public void removeAllComponents() {
    }
}
