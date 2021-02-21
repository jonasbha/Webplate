package webplate.config;

import webplate.list.ArticleList;

public class ArticleConfig extends ComponentConfig<ArticleList> {

    @Override
    public void setList(ArticleList list) {
        this.list = list;
    }

    @Override
    public ArticleList getList() {
        return list;
    }
}
