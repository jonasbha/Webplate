package website.page.component;

import website.page.Page;
import website.page.component.section.SectionGroup;

import java.util.LinkedList;

public class ArticleGroup implements Component {

    private final LinkedList<Article> articles = new LinkedList<>();
    Page page;

    public int section;


    public ArticleGroup(Page page) {
        this.page = page;
    }


    public Component get(int i) {
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
}
