package webplate.list;

import webplate.config.SchemaConfig;
import webplate.exception.ExceptionFactory;
import webplate.page.component.property.Field;

public class FieldList extends CustomArrayList<Field> {

    public SchemaConfig config = new SchemaConfig();

    public void add(String type) {
        if (config.listUnlocked()) {
            Field field = new Field();
            field.setType(type);
            this.addToRear(field);
        } else
            new ExceptionFactory().notCustomizable();
    }

    public void add(String type, boolean required) {
        if (config.listUnlocked()) {
            Field field = new Field();
            field.setType(type);
            field.setRequired(required);
            this.addToRear(field);
        } else
            new ExceptionFactory().notCustomizable();
    }
}
