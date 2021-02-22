package webplate.config;

import webplate.list.ArticleList;
import webplate.page.component.Article;

public class ArticleConfig extends ComponentConfig<ArticleList> {

    private Article article;

    public void setArticle(Article article) {
        this.article = article;
    }

    @Override
    public void setList(ArticleList list) {
        this.list = list;
    }

    @Override
    public ArticleList getList() {
        return list;
    }

    @Override
    public boolean isCustomizable() {
        return false;
    }

    @Override
    public void addToBottomOfPage() {
        list.config.getParent().config.components.remove(article);
        list.config.getParent().config.components.add(article);
    }
}
