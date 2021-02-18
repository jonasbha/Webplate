package website;

import website.page.Page;

public class Program {

    public static void main(String[] args) {
        // testes senere
        Page page = new Page("hello");
        page.schema.add();
        page.schema.get(1).add();
        page.schema.removeLast();
        page.schema.section.add();
        page.schema.section.get(1);
        // remove last?
        page.schema.section.removeLast();

        page.article.add();
        page.article.removeLast();

        //prob: change getter for nested class so no need to extend. easy
        page.article.get(1);


        //Webplate.Html.create();
        //Webplate.Html.addPage(page);
    }
}
