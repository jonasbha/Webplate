package website.list;

import website.page.component.Article;

public class FieldsetList<E> extends ComponentList<E> {


    @Override
    public void add() {
        this.add(type.cast(Article.class));
    }

    @Override
    public void add(int fieldsets) {
        for (int i = 0; i < fieldsets; i++)
            this.add(type.cast(Article.class));
    }
}
