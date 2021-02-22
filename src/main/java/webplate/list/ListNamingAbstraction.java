package webplate.list;

public abstract class ListNamingAbstraction<T> extends CustomArrayList<T> {

    public void removeAll() {
        removeAllItems();
    }

    public void removeLast() {
        removeLastItem();
    }
}
