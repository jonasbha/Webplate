package website.page.component.property;

import website.page.CRUD;
import website.page.component.ArticleGroup;

public class Section implements CRUD {
    private ArticleGroup group;

    private int sections;

    public Section(ArticleGroup articleGroup) {
        this.group = articleGroup;
    }

    @Override
    public void add(int n) {

    }

    public void add() {}

    @Override
    public void removeLast() {

    }

    @Override
    public void remove(int sectionNr) {

    }

    ;

    @Override
    public String getHTML() {
        return null;
    }
}
