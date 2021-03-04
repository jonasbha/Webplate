package webplate.list;

import webplate.exception.ExceptionFactory;
import webplate.page.component.Schema;

public class SchemaList extends ComponentList<Schema> {



    @Override
    public Schema addEmpty() {
        Schema schema = new Schema();
        schema.config.setList(this);
        schema.config.setCustomizable(true);
        schema.config.addToBottomOfPage();
        this.addToRear(schema);
        return schema;
    }

    @Override
    public Schema addDefault() {
        Schema schema = new Schema();
        schema.fieldset.add();
        schema.fieldset.add();
        schema.fieldset.get(0).field.add("username", true);
        schema.fieldset.get(0).field.add("email", true);
        schema.fieldset.get(0).field.add("phone_number", false);
        schema.fieldset.get(1).field.add("", false);
        schema.fieldset.get(0).field.get(0).setType("text");
        schema.fieldset.get(0).field.get(1).setType("email");
        schema.fieldset.get(0).field.get(2).setType("number");
        schema.fieldset.get(1).field.get(0).setType("textarea");

        schema.config.setCustomizable(false);
        schema.config.setList(this);
        schema.config.addToBottomOfPage();
        this.addToRear(schema);
        return schema;
    }

    @Override
    public Schema addDefault(boolean customizable) {
        Schema schema = new Schema();
        schema.fieldset.add();
        schema.fieldset.add();
        schema.fieldset.get(0).field.add("insert field name here", true);
        schema.fieldset.get(0).field.add("insert field name here", false);
        schema.fieldset.get(1).field.add("insert field name here", true);
        schema.config.setList(this);
        schema.config.setCustomizable(customizable);
        schema.config.addToBottomOfPage();
        this.addToRear(schema);
        return schema;
    }

    @Override
    public void removeAll() {
        removeAllItems();
        for (int i = 0; i < config.getParent().config.getComponents().size(); i++)
            if (config.getParent().config.getComponents().get(i).getClass() == Schema.class)
                config.getParent().config.getComponents().remove(i);
    }

    @Override
    public void removeLast() {
        if (this.isEmpty()) {
            new ExceptionFactory().emptyCollection("schema");
        }
        int last = config.getParent().config.getComponents().size()-1;
        int size = config.getParent().config.getComponents().size();

        while (config.getParent().config.getComponents().size() == size) {
            if (config.getParent().config.getComponents().get(last).getClass() == Schema.class) {
                config.getParent().config.getComponents().remove(last);
                removeLastItem();
            } else
                last--;
        }
    }
}
