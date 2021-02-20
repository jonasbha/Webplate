package webplate.list;

import webplate.page.component.Article;

public class ArticleList extends ComponentList<Article> {


    @Override
    public void addEmpty() {
        Article article = new Article();
        article.config.setDefault(false);
        this.add(article);
        config.getParent().components.add(article);
    }

    @Override
    public void addEmpty(int schemas) {
        for (int i = 0; i < schemas; i++) {
            Article article = new Article();
            article.config.setDefault(false);
            this.add(article);
            config.getParent().components.add(article);
        }
    }

    @Override
    public void addDefault() {
        Article article = new Article();
        article.config.setDefault(true);
        this.add(article);
        config.getParent().components.add(article);
    }

    @Override
    public void addDefault(int schemas) {
        for (int i = 0; i < schemas; i++) {
            Article article = new Article();
            article.config.setDefault(true);
            this.add(article);
            config.getParent().components.add(article);
        }
    }
}
