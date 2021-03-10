package webplate;

import webplate.page.Page;

import java.util.ArrayList;

public class Webplate {

    public static final ArrayList<Page> pages = new ArrayList<>();

    public static class html {

        private static String language;

        public static void setLanguage(String language) {
            html.language = language;
        }

        public static String getLanguage() {
            return language;
        }

        public void deleteAllFiles() {} //?

        public static void create() {
            FileHandler fg = new FileHandler();
            for (int i = 0; i < pages.size(); i++)
                fg.create(new HtmlGenerator().generatePage(i), i);
        }
    }

}
