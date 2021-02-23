package webplate.page.component;

import webplate.list.SchemaList;

public class SchemaConfig extends ComponentConfig<SchemaList> {

    protected Schema schema;

    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    @Override
    public void setList(SchemaList list) {
        this.list = list;
    }

    @Override
    public boolean isCustomizable() {
        return schema.config.customizable;
    }

    @Override
    public void addToBottomOfPage() {
        list.config.getParent().config.getComponents().remove(schema);
        list.config.getParent().config.getComponents().add(schema);
    }
}
