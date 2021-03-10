package webplate.page.component;

import webplate.list.ArrayListExtension;
import webplate.list.CustomArrayListAbstraction;
import webplate.page.Page;

import java.util.ArrayList;

public abstract class ComponentList<T> extends CustomArrayListAbstraction<T> {

    abstract public T addEmpty();

    abstract public T addDefault();

    abstract public T addDefault(boolean customizable);

    abstract public void removeAll();

    abstract public void removeLast();

    public static class Config {

        private static Page page;

        public static void setPage(Page page) {
            Config.page = page;
        }

        public static Page getPage() {
            return page;
        }
    }
}
