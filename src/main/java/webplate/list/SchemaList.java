package webplate.list;

import webplate.page.component.Schema;

public class SchemaList extends ComponentList<Schema> {

    @Override
    public void addEmpty() {
        Schema schema = new Schema();
        schema.config.setDefault(false);
        this.add(schema);
        config.getParent().components.add(schema);
    }

    @Override
    public void addEmpty(int schemas) {
        for (int i = 0; i < schemas; i++) {
            Schema schema = new Schema();
            schema.config.setDefault(false);
            this.add(schema);
            config.getParent().components.add(schema);
        }
    }

    @Override
    public void addDefault() {
        Schema schema = new Schema();
        schema.config.setDefault(true);
        this.add(schema);
        config.getParent().components.add(schema);
    }

    @Override
    public void addDefault(int schemas) {
        for (int i = 0; i < schemas; i++) {
            Schema schema = new Schema();
            schema.config.setDefault(true);
            this.add(schema);
            config.getParent().components.add(schema);
        }
    }

    public void addDefault(boolean customizable) {
        Schema schema = new Schema();
        schema.config.setDefault(true, customizable);
        this.add(schema);
        config.getParent().components.add(schema);
    }

    public void addDefault(int schemas, boolean customizable) {
        for (int i = 0; i < schemas; i++) {
            Schema schema = new Schema();
            schema.config.setDefault(true, customizable);
            this.add(schema);
            config.getParent().components.add(schema);
        }
    }
}
