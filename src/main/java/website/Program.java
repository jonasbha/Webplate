package website;

import website.page.Page;

public class Program {

    public static void main(String[] args) {
        // alle cases testes senere
        Page page = new Page("title");

        page.description = "";
        page.schemas.add();
        page.schemas.add(2);
        page.schemas.remove(2);
        page.schemas.removeLast();
        page.schemas.get(1).fieldsets.add();
        page.schemas.getLast().fieldsets.add(2);
        page.schemas.getLast().fieldsets.remove(2);
        page.schemas.getLast().fieldsets.removeLast();
        page.schemas.getLast().fieldsets.getLast();
        page.schemas.getLast().fieldsets.get(2).fields.getLast().add("Number", true);
        page.schemas.getLast().fieldsets.get(2).fields.getFirst().add("Email");

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
