package webplate.page.component;

import webplate.list.ArticleList;
import webplate.page.component.property.Section;


public class Article extends Component {

    public Article.config config = new config();
    public Section section = new Section(this);

    public Article() {
        config.article = this;
    }

    public static class config extends ComponentConfig<ArticleList> {

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
            list.page.config.getComponents().remove(article);
            list.page.config.getComponents().add(article);
        }
    }
}
