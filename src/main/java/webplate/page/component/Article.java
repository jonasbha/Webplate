package webplate.page.component;

import webplate.config.ArticleConfig;
import webplate.page.component.property.Section;


public class Article extends Component {

    public ArticleConfig config = new ArticleConfig();
    public Section section;

    public Article() {
        super();
    }

    //refactorable?
    public void initializePosition() {
        this.setPosition(config.getList().config.getPosition());
        config.getList().config.incrementPosition();
    }
}
