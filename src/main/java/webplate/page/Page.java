package webplate.page;

import webplate.list.ArticleList;
import webplate.list.SchemaList;
import webplate.page.feature.Feature;

public class Page  {

    public Metadata metadata = new Metadata();
    public Feature feature = new Feature();
    public ArticleList article = new ArticleList();
    public SchemaList schema = new SchemaList();
    public PageConfig config = new PageConfig();

    public Page(String title) {
        metadata.setTitle(title);
        schema.config.parent = this;
        article.config.parent = this;
        config.parent = this;
    }

    public Page(String title, String description) {
        metadata.setTitle(title);
        metadata.setDescription(description);
    }
}
