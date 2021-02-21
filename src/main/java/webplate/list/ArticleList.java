package webplate.list;

import webplate.page.component.Article;

public class ArticleList extends ComponentList<Article> {


    @Override
    public void addEmpty() {
        Article article = new Article();
        article.config.setList(this);
        article.config.setDefault(false);
        article.initializePosition();
        this.addToRear(article);
    }

    @Override
    public void addDefault() {
        Article article = new Article();
        article.config.setList(this);
        article.config.setDefault(true);
        article.initializePosition();
        this.addToRear(article);
    }

}
