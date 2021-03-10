package webplate.page.component.article;

import webplate.exception.ExceptionFactory;

public class Section {

    private final Article article;
    private int value;

    public Section(Article article) {
        this.article = article;
    }

    public int size() { return value; }

    public void add() {
        if (article.Config.isCustomizable())
            value++;
        else
            new ExceptionFactory().notCustomizable("article");
    }

    public void add(int sections) {
        value += sections;
    }

    public void removeLast() {
        value--;
    }

    public void removeAll() {
        value = 0;
    }
}

