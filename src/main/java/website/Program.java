package website;

import website.page.Page;
import website.page.component.Article;
import website.page.component.ArticleGroup;

public class Program {

    public static void main(String[] args) {
        // alle cases testes senere
        Page page = new Page("title");

        page.description = "";
        page.schema.first().add();
        page.schema.get(2).add();

        page.schema.add();
        page.schema.add(2);
        page.schema.get(2);
        page.schema.remove(2);
        page.schema.removeLast();
        page.schema.fieldset.add();
        page.schema.get(2).fieldset.add(2);
        page.schema.fieldset.remove(2);
        page.schema.fieldset.removeLast();

        page.schema.fieldset.field.add("Number", true);
        page.schema.fieldset.field.add("Email");
        page.schema.fieldset.get(3).field.add("Name", true);
        page.schema.get(2).fieldset.get(3).field.add("Comment");

        page.article.add();
        page.article.add(2);
        page.article.get(1);
        page.article.remove(2);
        page.article.removeLast();
        page.article.section.add();
        page.article.section.add(2);
        page.article.section.remove(2);
        page.article.section.removeLast();

        Webplate.html.create();
        Webplate.html.addPage(page);

        page.articles.add();

        // how to decide order of component without polluting page scope.
        // how to do page.title?
        //page.article = new ArticleGroup();


    }
}
