package webplate.list;

import webplate.page.component.Article;

public class ArticleList extends ExtendedList<Article> implements AddExtension {


    @Override
    public void add() {
        this.add(new Article());
    }

    @Override
    public void add(int sections) {
        for (int i = 0; i < sections; i++)
            this.add(new Article());
    }


}
