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
        }
    }

}
