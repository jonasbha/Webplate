package webplate.page;

import webplate.list.ArticleList;
import webplate.list.SchemaList;
import webplate.page.feature.Feature;

public class Page  {

    public Metadata metadata = new Metadata();
    public Feature feature = new Feature();
    public ArticleList article = new ArticleList();
    public SchemaList schema = new SchemaList();

    public Page(String title) {
        metadata.setTitle(title);
        schema.config.setParent(this);
        article.config.setParent(this);
    }

    public Page(String title, String description) {
        metadata.setTitle(title);
        metadata.setDescription(description);
    }

}
