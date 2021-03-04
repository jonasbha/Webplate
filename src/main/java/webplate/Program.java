package webplate;

import webplate.page.Page;

public class Program {

    public static void main(String[] args) {
        /*
        * to do:
        * add descriptions like in the list.
        * */

        // intellij generate jar file.
        // alle cases testes senere
        Page page = new Page("title");

        //page.article.addEmpty("VG");
        //page.article.getLast().section.add("Sport");
        //page.schema.getLast().fieldset.getLast().field.addNumber();
        //page.schema.getLast().fieldset.add().field.addText();
        //page.schema.getLast().fieldset.add().field.addEmail();
        //page.schema.getLast().fieldset.add().field.addPassword();
        //page.schema.getLast().fieldset.add().field.addCommentField;

        //page.schema.getLast().fieldset.add().field.addText();


        page.schema.addEmpty();
        page.schema.addEmpty();
        page.schema.removeLast();
        page.schema.addDefault(true);
        page.schema.getLast().fieldset.add();
        page.schema.getLast().fieldset.add(2);
        page.schema.getLast().fieldset.removeLast();
        page.schema.getLast().fieldset.removeLast();
        page.schema.getLast().fieldset.getLast();
        page.schema.getLast().fieldset.getLast().field.add("Number", true);
        page.schema.getLast().fieldset.getLast().field.add("Email");
        page.schema.getLast().fieldset.getLast().field.add("TextField");
        page.schema.getLast().fieldset.getLast().field.removeAll();
        page.schema.getLast().fieldset.removeAll();
        page.schema.getLast();

        page.article.addDefault();
        page.article.addEmpty();
        page.article.addDefault(true);
        page.article.getLast();
        page.article.removeLast();
        page.article.get(2);
        page.article.getLast().section.add();
        page.article.getLast().section.add(2);
        page.article.get(2).section.add();
        page.article.getLast().section.removeLast();
        page.article.getLast().section.removeAll();

        page.metadata.setDescription("Hello");
        page.metadata.addStylesheet();
        page.metadata.setTitle("New title");
        page.metadata.setLanguage("nb");

        page.feature.addCopyright();

        Webplate.html.create();
        Webplate.pages.add(page);
        Webplate.html.setLanguage("nb");

    }
}
