package website.list;

import website.page.component.Article;

public class ArticleList<E> extends ComponentList<E> {

    private int articles;
    @Override
    public void add() {
        articles++;
    }

    public void add(int articles) {
        this.articles += articles;
    }

    public int getArticles() {
        return articles;
    }

}
