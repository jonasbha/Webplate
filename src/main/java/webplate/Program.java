package webplate;

import webplate.exception.ExceptionFactory;
import webplate.page.Page;

public class Program {

    public static void main(String[] args) {
        // alle cases testes senere
        Page page = new Page("title");

        page.schema.addDefault(false);
        page.schema.getFirst().fieldset.add();

        System.out.println(page.components.get(0));
        page.schema.addEmpty();
        page.schema.addDefault(3);
        page.schema.addEmpty();
        page.schema.addEmpty(2);
        page.schema.remove(2);
        page.schema.removeLast();

        page.article.addDefault();
        page.article.addEmpty(2);
        page.article.getFirst();
        page.article.removeLast();

        // needs to be tested:

        page.schema.addDefault(2, true);
        page.schema.addDefault(false);
        page.schema.getLast().config.setDefault(false);
        page.schema.get(1).fieldset.add();
        page.schema.getLast().fieldset.add(2);
        page.schema.getLast().fieldset.remove(2);
        page.schema.getLast().fieldset.removeLast();
        page.schema.getLast().fieldset.getLast();
        page.schema.getLast().fieldset.get(2).field.add("Number", true);
        page.schema.get(2).fieldset.get(2).field.add("Email");
        page.schema.get(2).fieldset.get(2).field.add("TextField");
        page.schema.getFirst().fieldset.getFirst().field.removeAll();
        page.schema.getFirst().fieldset.removeAll();
        page.schema.removeAll();

        page.article.getLast().section.add();
        page.article.getLast().section.add(2);
        page.article.getLast().section.removeLast();
        page.article.getLast().section.remove(2);

        page.metadata.setDescription("Hello");
        page.metadata.addStylesheet();
        page.metadata.setTitle("New title");

        page.feature.addCopyright();

        Webplate.html.create();
        Webplate.html.addPage(page);
        Webplate.html.setLanguage("nb");

    }
}
