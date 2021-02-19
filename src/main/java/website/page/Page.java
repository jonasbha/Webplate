package website.page;

import website.list.ArticleList;
import website.list.SchemaList;
import website.page.component.Article;
import website.page.component.Schema;
import website.page.feature.Feature;

public class Page  {
    private String title;
    public String description;
    private String[] links;

    public Feature feature = new Feature();
    public ArticleList<Article> articles = new ArticleList<>();
    public SchemaList<Schema> schemas = new SchemaList<>();

    public Page(String title) {

    }

}
