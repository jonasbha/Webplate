package website.list;

import website.page.component.Article;

public class SchemaList<E> extends ComponentList<E> {

    @Override
    public void add() {
        this.add(type.cast(Article.class));
    }

    @Override
    public void add(int schemas) {
        for (int i = 0; i < schemas; i++)
            this.add(type.cast(Article.class));
    }
}
