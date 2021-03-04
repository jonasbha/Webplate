package webplate.list;

import webplate.page.component.SchemaConfig;
import webplate.exception.ExceptionFactory;
import webplate.page.component.property.FieldSet;

public class FieldsetList extends ListNamingAbstraction<FieldSet> {

    public SchemaConfig config = new SchemaConfig();

    public FieldSet add() {
        if (config.isCustomizable()) {
            FieldSet fieldSet = new FieldSet();
            fieldSet.field.config.setSchema(config.getSchema());
            this.addToRear(fieldSet);
            return fieldSet;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }
}
