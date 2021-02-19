package website.page.component;

import website.page.Page;
import website.page.component.property.FieldSetGroup;

import java.util.LinkedList;

public class SchemaGroup implements Component {
    private final LinkedList<Schema> schemas = new LinkedList<>();

    Page page;

    public FieldSetGroup fieldset;

    public SchemaGroup() {}

    public SchemaGroup(Page page) {
        this.page = page;
    }

    public Schema get(int schema) {
        return schemas.get(schema);
    }

    public void add() {
        schemas.add(new Schema(this));
    }

    public void add(int schemas) {
        for (int i = 0; i < schemas; i++) {
            this.schemas.add(new Schema(this));
        }
    }

    public void removeLast() {
        schemas.remove();
    }

    @Override
    public void remove(int schemaNr) {

    }

    @Override
    public String getHTML() {
        return null;
    }
}
