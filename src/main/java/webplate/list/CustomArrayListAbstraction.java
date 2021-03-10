package webplate.list;

public abstract class CustomArrayListAbstraction<T> extends CustomArrayList<T> {

    public void removeAll() {
        removeAllItems();
    }

    public void removeLast() {
        removeLastItem();
    }
}
