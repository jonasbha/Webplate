package webplate.list;

import webplate.page.component.Schema;

public class SchemaList extends ComponentList<Schema> {

    @Override
    public void addEmpty() {
        Schema schema = new Schema();
        schema.config.setList(this);
        schema.config.setDefault(false);
        schema.initializePosition();
        this.addToRear(schema);
    }

    @Override
    public void addDefault() {
        Schema schema = new Schema();
        schema.config.setList(this);
        schema.config.setDefault(true);
        schema.initializePosition();
        this.addToRear(schema);
    }

    public void addDefault(boolean customizable) {
        Schema schema = new Schema();
        schema.config.setList(this);
        schema.config.setDefault(true);
        schema.config.setCustomizable(customizable);
        schema.initializePosition();
        this.addToRear(schema);
    }

}
