package website.page;

import website.list.ArticleList;
import website.list.SchemaList;
import website.page.component.Article;
import website.page.component.Schema;
import website.page.feature.Feature;

import java.util.LinkedList;

public class Page  {
    //public String title;
    //public String description;
    //public LinkedList<String> stylesheet;

    public Feature feature = new Feature();
    public ArticleList<Article> article = new ArticleList<>();
    public SchemaList<Schema> schema = new SchemaList<>();

    public Page(String title) {}

}
