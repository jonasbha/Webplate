package webplate.page.component;

import webplate.page.component.property.Section;


public class Article extends Component {

    public ArticleConfig config = new ArticleConfig();
    public Section section = new Section(this);

    public Article() {
        super();
        config.article = this;
    }
}
