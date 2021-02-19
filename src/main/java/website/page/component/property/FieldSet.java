package website.page.component.property;

import website.page.CRUD;
import website.page.component.Schema;

public class FieldSet implements CRUD {

    public Field field;
    Schema schema;

    public FieldSet(Schema schema) {
        this.schema = schema;
        field = new Field();
    }


    @Override
    public String getHTML() {
        return null;
    }

    @Override
    public void add(int n) {

    }

    @Override
    public void add() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void remove(int n) {

    }
}
