package webplate.list;

import webplate.config.SchemaConfig;
import webplate.exception.ExceptionFactory;
import webplate.page.component.property.FieldSet;

public class FieldsetList extends ListNamingAbstraction<FieldSet> {

    public SchemaConfig config = new SchemaConfig();

    public void add() {
        if (config.isCustomizable()) {
            FieldSet fieldSet = new FieldSet();
            fieldSet.field.config.setSchema(config.getSchema());
            this.addToRear(fieldSet);
        } else
            new ExceptionFactory().notCustomizable("schema");
    }

    public void add(int fieldsets) {
        if (config.isCustomizable()) {
            for (int i = 0; i < fieldsets; i++) {
                FieldSet fieldSet = new FieldSet();
                fieldSet.field.config.setSchema(config.getSchema());
                this.addToRear(fieldSet);
            }
        } else
            new ExceptionFactory().notCustomizable("schema");
    }
}
