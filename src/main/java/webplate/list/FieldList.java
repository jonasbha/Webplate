package webplate.list;

import webplate.config.SchemaPropertyConfig;
import webplate.exception.ExceptionFactory;
import webplate.page.component.property.Field;

public class FieldList extends ExtendedList<Field> {

    public SchemaPropertyConfig config = new SchemaPropertyConfig();

    public void add(String type) {
        if (config.listUnlocked()) {
            Field field = new Field();
            field.setType(type);
            this.add(field);
        } else
            new ExceptionFactory().notCustomizable();
    }

    public void add(String type, boolean required) {
        if (config.listUnlocked()) {
            Field field = new Field();
            field.setType(type);
            field.setRequired(required);
            this.add(field);
        } else
            new ExceptionFactory().notCustomizable();
    }
}
