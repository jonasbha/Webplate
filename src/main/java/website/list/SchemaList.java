package website.list;

public class SchemaList<E> extends ComponentList<E> {
    private int schemas;
    @Override
    public void add() {
        schemas++;
    }

    public void add(int schemas) {
        this.schemas += schemas;
    }

    public int getSchemas() {
        return schemas;
    }

}
