package webplate.page.component.schema;

import webplate.exception.ExceptionFactory;
import webplate.list.ListNamingAbstraction;

public class FieldsetList extends ListNamingAbstraction<FieldSet> {

    public Schema.Config Config = new Schema.Config();

    public FieldSet add() {
        if (Config.isCustomizable()) {
            FieldSet fieldSet = new FieldSet();
            fieldSet.Field.Config.setSchema(Config.getSchema());
            this.addToRear(fieldSet);
            return fieldSet;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }
}
