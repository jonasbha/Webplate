package website.list;

import website.page.component.Article;

public class ArticleList<E> extends ComponentList<E> {


    @Override
    public void add() {
        this.add(type.cast(Article.class));
    }

    @Override
    public void add(int sections) {
        for (int i = 0; i < sections; i++)
            this.add(type.cast(Article.class));
    }


}
