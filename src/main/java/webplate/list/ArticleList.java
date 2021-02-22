package webplate.list;

import webplate.page.component.Article;

public class ArticleList extends ComponentList<Article> {


    @Override
    public void addEmpty() {
        Article article = new Article();
        article.config.setList(this);
        article.config.setDefault(false);
        article.config.addToBottomOfPage();
        this.addToRear(article);
    }

    @Override
    public void addDefault() {
        Article article = new Article();
        article.config.setList(this);
        article.config.setDefault(true);
        article.config.addToBottomOfPage();
        this.addToRear(article);
    }

    public Article getArticle(int index)
    {
        return get(index);
    }

}
