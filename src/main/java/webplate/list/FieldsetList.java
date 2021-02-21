package webplate.list;

import webplate.config.SchemaConfig;
import webplate.exception.ExceptionFactory;
import webplate.page.component.property.FieldSet;

public class FieldsetList extends CustomArrayList<FieldSet> {

    public SchemaConfig config = new SchemaConfig();

    public void add() {
        if (config.listUnlocked()) {
            FieldSet fieldSet = new FieldSet();
            fieldSet.field.config.setSchema(config.getSchema());
            this.addToRear(fieldSet);
        } else
            new ExceptionFactory().notCustomizable();
    }

    public void add(int fieldsets) {
        if (config.listUnlocked()) {
            for (int i = 0; i < fieldsets; i++) {
                FieldSet fieldSet = new FieldSet();
                fieldSet.field.config.setSchema(config.getSchema());
                this.addToRear(fieldSet);
            }
        } else
            new ExceptionFactory().notCustomizable();
    }

}
