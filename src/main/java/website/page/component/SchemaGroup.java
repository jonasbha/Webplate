package website.page.component;

import website.page.Page;
import website.page.component.section.SectionGroup;

import java.util.LinkedList;

public class SchemaGroup implements Component {
    private final LinkedList<Schema> schemas = new LinkedList<>();

    public SchemaGroup() {}

    public SchemaGroup(Page page) {
        this.page = page;
    }

    Page page;

    public SectionGroup section;

    public Schema get(int schema) {
        return schemas.get(schema);
    }

    public void add() {
        this.page.components.add(this);
    }

    public void add(int n) {
        this.page.components.add(this);
    }

    public void removeLast() {
        schemas.remove();
    }

    @Override
    public String getHTML() {
        return null;
    }
}
