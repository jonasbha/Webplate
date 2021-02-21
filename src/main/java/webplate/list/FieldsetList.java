package webplate.list;

import webplate.config.SchemaPropertyConfig;
import webplate.exception.ExceptionFactory;
import webplate.page.component.property.FieldSet;

public class FieldsetList extends ExtendedList<FieldSet> {

    public SchemaPropertyConfig config = new SchemaPropertyConfig();

    public void add() {
        if (config.listUnlocked()) {
            FieldSet fieldSet = new FieldSet();
            fieldSet.field.config.setSchema(config.getSchema());
            this.add(fieldSet);
        } else
            new ExceptionFactory().notCustomizable();
    }

    public void add(int fieldsets) {
        if (config.listUnlocked()) {
            for (int i = 0; i < fieldsets; i++) {
                FieldSet fieldSet = new FieldSet();
                fieldSet.field.config.setSchema(config.getSchema());
                this.add(fieldSet);
            }
        } else
            new ExceptionFactory().notCustomizable();
    }

}
