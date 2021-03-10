package webplate;

import webplate.page.Page;

public class Program {

    public static void main(String[] args) {
        /*
        * to do:
        * add descriptions like in the list.
        * */

        // alle cases testes senere
        Page page = new Page("title");

        //page.article.addEmpty("VG");
        //page.article.getLast().section.add("Sport");
        // table og social media

        page.schema.addDefault(true);
        page.schema.getLast().fieldset.add();
        page.schema.getLast().fieldset.add();
        page.schema.getLast().fieldset.removeLast();
        page.schema.getLast().fieldset.removeLast();
        page.schema.getLast().fieldset.getLast();
        page.schema.addEmpty().fieldset.add().field.addEmail().addText("name", true)
                .addCommentfield().addNumber("Phone", true);
        page.schema.getLast().fieldset.getLast().field.removeAll();
        page.schema.getLast().fieldset.removeAll();
        page.schema.getLast();

        page.article.addDefault();
        page.article.addEmpty();
        page.article.addDefault(true);
        page.article.getLast();
        page.article.get(1);
        page.article.getLast().section.add();
        page.article.getLast().section.add(2);
        page.article.get(1).section.add();
        page.article.getLast().section.removeLast();
        page.article.getLast().section.removeAll();

        page.metadata.setDescription("Hello");
        page.metadata.addStylesheet();
        page.metadata.setTitle("New title");

        page.feature.addCopyright();

        Webplate.html.create();
        Webplate.pages.add(page);
        Webplate.html.setLanguage("nb");



    }
}
