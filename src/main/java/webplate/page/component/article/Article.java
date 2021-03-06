package webplate.page.component.article;

import webplate.page.component.Component;
import webplate.page.component.ComponentList;


public class Article extends Component {

    public Article.Config Config = new Config();
    public Section Section = new Section(this);

    public Article() {
        Config.article = this;
    }

    public static class Config extends ComponentConfig<ArticleList> {

        protected Article article;

        @Override
        protected void setList(ArticleList list) {
            this.list = list;
        }

        @Override
        public boolean isCustomizable() {
            return customizable;
        }

        @Override
        public void addToBottomOfPage() {
            ComponentList.Config.getPage().Config.getComponents().remove(article);
            ComponentList.Config.getPage().Config.getComponents().add(article);
        }
    }
}
