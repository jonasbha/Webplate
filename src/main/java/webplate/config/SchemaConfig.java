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

    public boolean listUnlocked() {
        return schema.config.isCustomizable();
    }

    @Override
    public void setList(SchemaList list) {
        this.list = list;
    }

    @Override
    public SchemaList getList() {
        return list;
    }
}
