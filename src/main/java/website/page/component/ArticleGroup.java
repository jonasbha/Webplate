package website.page.component;

import website.page.Page;
import website.page.component.property.Section;

import java.util.LinkedList;

public class ArticleGroup implements Component {

    private final LinkedList<Article> articles = new LinkedList<>();
    Page page;

    public Section section;


    public ArticleGroup(Page page) {
        this.page = page;
        section = new Section(this);
    }


    public Article get(int i) {
        return articles.get(i);
    }

    @Override
    public String getHTML() {
        return null;
    }

    @Override
    public void add() {

    }

    @Override
    public void add(int n) {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void remove(int articleNr) {

    }
}
