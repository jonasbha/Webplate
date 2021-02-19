package website;

import website.page.Page;

public class Program {

    public static void main(String[] args) {
        // alle cases testes senere
        Page page = new Page("title");

        page.config.addDescription("Hello");
        page.config.addStylesheet();
        page.config.setTitle("New title");
        page.schema.add();
        page.schema.add(2);
        page.schema.remove(2);
        page.schema.removeLast();
        page.schema.get(1).fieldset.add();
        page.schema.getLast().fieldset.add(2);
        page.schema.getLast().fieldset.remove(2);
        page.schema.getLast().fieldset.removeLast();
        page.schema.getLast().fieldset.getLast();
        page.schema.getLast().fieldset.get(2).field.getLast().add("Number", true);
        page.schema.getLast().fieldset.get(2).field.getFirst().add("Email");

        page.article.add();
        page.article.add(2);
        page.article.getFirst();
        page.article.removeLast();
        page.article.getLast().section.add();
        page.article.getLast().section.add(2);
        page.article.getLast().section.removeLast();
        page.article.getLast().section.remove(2);

        page.feature.addCopyright();

        Webplate.html.create();
        Webplate.html.addPage(page);


        // how to decide order of component without polluting page scope.
        // how to do page.title?
        //page.article = new ArticleGroup();


    }
}
