package webplate.list;

import webplate.exception.ExceptionFactory;
import webplate.page.component.Article;

public class ArticleList extends ComponentList<Article> {


    @Override
    public void addEmpty() {
        Article article = new Article();
        article.config.setList(this);
        article.config.setCustomizable(true);
        article.config.addToBottomOfPage();
        this.addToRear(article);
    }

    @Override
    public void addDefault() {
        Article article = new Article();
        article.section.add(2);
        article.config.setCustomizable(false);
        article.config.setList(this);
        article.config.addToBottomOfPage();
        this.addToRear(article);
    }

    @Override
    public void addDefault(boolean customizable) {
        Article article = new Article();
        article.section.add(2);
        article.config.setList(this);
        article.config.setCustomizable(customizable);
        article.config.addToBottomOfPage();
        this.addToRear(article);
    }

    @Override
    public void removeAll() {
        removeAllItems();
        for (int i = 0; i < config.getParent().config.getComponents().size(); i++)
            if (config.getParent().config.getComponents().get(i).getClass() == Article.class)
                config.getParent().config.getComponents().remove(i);
    }

    @Override
    public void removeLast() {
        if (this.isEmpty())
            new ExceptionFactory().emptyCollection("schema");

        int last = config.getParent().config.getComponents().size()-1;
        int size = config.getParent().config.getComponents().size();

        while (config.getParent().config.getComponents().size() == size) {
            if (config.getParent().config.getComponents().get(last).getClass() == Article.class) {
                config.getParent().config.getComponents().remove(last);
                removeLastItem();
            } else
                last--;
        }
    }

}
