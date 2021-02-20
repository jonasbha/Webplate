package website;

import website.page.Page;

import java.util.ArrayList;

public class Webplate {

    public static class html {
        private static String language;
        private static ArrayList<Page> pages;


        public static void addPage(Page page) {
            pages.add(page);
        }

        public void removePage(Page page) {

        }

        public void delete() {

        }

        public static void setLanguage(String language) {
            html.language = language;
        }

        public static String getLanguage() {
            return language;
        }

        public static void create() {
            StringBuilder builder = new StringBuilder();

            for (Page page : pages) {

                builder.append("<head><head/>\n")
                        .append("<body>");
                for (int b = 0; b < page.article.size(); b++) {

                    builder.append("<article></article>");
                    for (int j = 0; j < page.article.get(b).section.size(); j++) {
                        builder.append("<section></section>");
                    }
                }
                builder.append("</body>... osv");
            }


        }
    }

}
