package website;

import website.page.Page;

import java.util.ArrayList;

public class Webplate {

    public static class html {
        private String language;
        private static ArrayList<Page> pages;


        public static void addPage(Page page) {
            pages.add(page);
        }

        public void removePage(Page page) {

        }

        public void delete() {

        }


        public static void create() {
            StringBuilder builder = new StringBuilder();

            for (int a = 0; a < pages.get(a).articles.getArticles(); a++) {

                builder.append("<head><head/>")
                        .append("<header></header>.... osv");
                for (int i = 0; i < pages.get(a).articles.getArticles(); i++) {

                    builder.append("<article></article>");
                    for (int j = 0; j < pages.get(a).articles.get(i).sections; j++) {
                        builder.append("<section></section>");
                    }
                }
            }


        }
    }

}
