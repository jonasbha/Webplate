package webplate.page.component.article;

import webplate.exception.ExceptionFactory;
import webplate.page.component.ComponentList;

public class ArticleList extends ComponentList<Article> {


    @Override
    public Article addEmpty() {
        Article article = new Article();
        article.Config.setList(this);
        article.Config.setCustomizable(true);
        article.Config.addToBottomOfPage();
        this.addToRear(article);
        return article;
    }

    @Override
    public Article addDefault() {
        Article article = new Article();
        article.Section.add(2);
        article.Config.setCustomizable(false);
        article.Config.setList(this);
        article.Config.addToBottomOfPage();
        this.addToRear(article);
        return article;
    }

    @Override
    public Article addDefault(boolean customizable) {
        Article article = new Article();
        article.Section.add(2);
        article.Config.setList(this);
        article.Config.setCustomizable(customizable);
        article.Config.addToBottomOfPage();
        this.addToRear(article);
        return article;
    }

    @Override
    public void removeAll() {
        removeAllItems();
        for (int i = 0; i < Config.getPage().Config.getComponents().size(); i++)
            if (Config.getPage().Config.getComponents().get(i).getClass() == Article.class)
                Config.getPage().Config.getComponents().remove(i);
    }

    @Override
    public void removeLast() {
        if (this.isEmpty())
            new ExceptionFactory().emptyCollection("schema");

        int last = Config.getPage().Config.getComponents().size()-1;
        int size = Config.getPage().Config.getComponents().size();

        while (Config.getPage().Config.getComponents().size() == size) {
            if (Config.getPage().Config.getComponents().get(last).getClass() == Article.class) {
                Config.getPage().Config.getComponents().remove(last);
                removeLastItem();
            } else
                last--;
        }
    }

}
