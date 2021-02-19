package website.page.component.property;

import website.page.CRUD;
import website.page.component.Schema;

import java.util.ArrayList;

public class FieldSetGroup implements CRUD {

    private Schema schema;
    public FieldGroup field;


    public FieldSetGroup(Schema schema) {
        this.schema = schema;
        field = new FieldGroup(this);
    }

    private final ArrayList<FieldSet> fieldsets = new ArrayList<>();

    public void add() {
        fieldsets.add(new FieldSet(schema));
    }

    public void add(int sections) {
        for (int i = 0; i < sections; i++)
            this.fieldsets.add(new FieldSet(schema));
    };

    public FieldSet get(int i) {
        return fieldsets.get(i);
    }

    public void removeLast() {}

    @Override
    public void remove(int fieldsetNr) {

    }

    @Override
    public String getHTML() {
        return null;
    }
}
