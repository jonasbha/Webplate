package webplate.config;

import webplate.list.SchemaList;
import webplate.page.component.Schema;

public class SchemaConfig extends ComponentConfig<SchemaList> {

    private Schema schema;

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public Schema getSchema() {
        return schema;
    }

    @Override
    public void setList(SchemaList list) {
        this.list = list;
    }

    @Override
    public SchemaList getList() {
        return list;
    }

    @Override
    public boolean isCustomizable() {
        return schema.config.customizable;
    }

    @Override
    public void addToBottomOfPage() {
        list.config.getParent().config.components.remove(schema);
        list.config.getParent().config.components.add(schema);
    }
}
