package webplate;


import webplate.page.Page;

public class Program {

    public static void main(String[] args) {

        // alle cases testes senere
        Page page = new Page("title");

        //page.article.addEmpty("VG");
        //page.article.getLast().section.add("Sport");
        // table og social media

        page.Schema.addDefault(true);
        page.Schema.getLast().Fieldset.add();
        page.Schema.getLast().Fieldset.add();
        page.Schema.getLast().Fieldset.removeLast();
        page.Schema.getLast().Fieldset.removeLast();
        page.Schema.getLast().Fieldset.getLast();
        page.Schema.addEmpty().Fieldset.add().Field.addEmail().addText("name", true)
                .addCommentfield().addNumber("Phone", true);
        page.Schema.getLast().Fieldset.getLast().Field.removeAll();
        page.Schema.getLast().Fieldset.removeAll();
        page.Schema.getLast();

        page.Article.addDefault();
        page.Article.addEmpty();
        page.Article.addDefault(true);
        page.Article.getLast();
        page.Article.get(1);
        page.Article.getLast().Section.add();
        page.Article.getLast().Section.add(2);
        page.Article.get(1).Section.add();
        page.Article.getLast().Section.removeLast();
        page.Article.getLast().Section.removeAll();

        page.Metadata.setDescription("Hello");
        page.Metadata.addStylesheet();
        page.Metadata.setTitle("New title");

        page.Feature.addCopyright();

        Webplate.Html.create();
        Webplate.Pages.add(page);
        Webplate.Html.setLanguage("nb");
    }
}
