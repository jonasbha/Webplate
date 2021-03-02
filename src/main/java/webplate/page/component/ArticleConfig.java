package webplate.page.component;

import webplate.list.ArticleList;

public class ArticleConfig extends ComponentConfig<ArticleList> {

    protected Article article;

    @Override
    public void setList(ArticleList list) {
        this.list = list;
    }

    @Override
    public boolean isCustomizable() {
        return customizable;
    }

    @Override
    public void addToBottomOfPage() {
        list.config.getParent().config.getComponents().remove(article);
        list.config.getParent().config.getComponents().add(article);
    }
}
