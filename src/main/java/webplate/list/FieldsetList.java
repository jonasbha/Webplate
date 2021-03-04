package webplate.list;

import webplate.exception.ExceptionFactory;
import webplate.page.component.Schema;
import webplate.page.component.property.FieldSet;

public class FieldsetList extends ListNamingAbstraction<FieldSet> {

    public Schema.config config = new Schema.config();

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
