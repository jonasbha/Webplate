package webplate;

import webplate.page.Page;

import java.util.ArrayList;

public class Webplate {

    public static final ArrayList<Page> Pages = new ArrayList<>();

    public static class Html {

        private static String language = "en";

        public static void setLanguage(String language) {
            Html.language = language;
        }

        public static String getLanguage() {
            return language;
        }

        public void deleteAllFiles() {} //?

        public static void create() {
            FileHandler fg = new FileHandler();
            for (int i = 0; i < Pages.size(); i++)
                fg.create(new HtmlGenerator().generatePage(i), i);
        }
    }

}
