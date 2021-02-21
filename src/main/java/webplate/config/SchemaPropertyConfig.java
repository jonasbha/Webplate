package webplate.config;

import webplate.page.component.Schema;

public class SchemaPropertyConfig {

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
}
