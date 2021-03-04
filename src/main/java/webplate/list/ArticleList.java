package webplate.list;

import webplate.exception.ExceptionFactory;
import webplate.page.component.Article;

public class ArticleList extends ComponentList<Article> {


    @Override
    public Article addEmpty() {
        Article article = new Article();
        article.config.setList(this);
        article.config.setCustomizable(true);
        article.config.addToBottomOfPage();
        this.addToRear(article);
        return article;
    }

    @Override
    public Article addDefault() {
        Article article = new Article();
        article.section.add(2);
        article.config.setCustomizable(false);
        article.config.setList(this);
        article.config.addToBottomOfPage();
        this.addToRear(article);
        return article;
    }

    @Override
    public Article addDefault(boolean customizable) {
        Article article = new Article();
        article.section.add(2);
        article.config.setList(this);
        article.config.setCustomizable(customizable);
        article.config.addToBottomOfPage();
        this.addToRear(article);
        return article;
    }

    @Override
    public void removeAll() {
        removeAllItems();
        for (int i = 0; i < page.config.getComponents().size(); i++)
            if (page.config.getComponents().get(i).getClass() == Article.class)
                page.config.getComponents().remove(i);
    }

    @Override
    public void removeLast() {
        if (this.isEmpty())
            new ExceptionFactory().emptyCollection("schema");

        int last = page.config.getComponents().size()-1;
        int size = page.config.getComponents().size();

        while (page.config.getComponents().size() == size) {
            if (page.config.getComponents().get(last).getClass() == Article.class) {
                page.config.getComponents().remove(last);
                removeLastItem();
            } else
                last--;
        }
    }

}
