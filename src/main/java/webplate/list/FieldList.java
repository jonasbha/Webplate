package webplate.list;

import webplate.page.component.SchemaConfig;
import webplate.exception.ExceptionFactory;
import webplate.page.component.property.Field;

public class FieldList extends ListNamingAbstraction<Field> {

    public SchemaConfig config = new SchemaConfig();

    public FieldList add(String name) {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setName(name);
            field.setType("text");
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }

    public FieldList add(String name, boolean required) {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setName(name);
            field.setType("text");
            field.setRequired(required);
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }
}
