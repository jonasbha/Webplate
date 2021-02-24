package webplate.page.component.property;

import webplate.exception.ExceptionFactory;
import webplate.page.component.Article;

public class Section {

    private Article article;
    private int value;

    public Section(Article article) {
        this.article = article;
    }

    public int size() { return value; }

    public void add() {
        if (article.config.isCustomizable())
            value++;
        else
            new ExceptionFactory().notCustomizable("article");
    }

    public void add(int sections) {}

    public void remove(int index) {}

    public void removeLast() {}

}

