package website.list;

public class FieldsetList<E> extends ComponentList<E> {

    private int fieldsets;
    @Override
    public void add() {
        fieldsets++;
    }

    public void add(int schemas) {
        this.fieldsets += schemas;
    }

    public int getFieldsets() {
        return fieldsets;
    }
}
