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
        schema.fieldset.get(0).field.addText("username", true);
        schema.fieldset.get(0).field.addEmail(true);
        schema.fieldset.get(0).field.addNumber("phone", false);
        schema.fieldset.get(1).field.addCommentfield( false);

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
        schema.fieldset.get(0).field.addText("username", true);
        schema.fieldset.get(0).field.addEmail(true);
        schema.fieldset.get(0).field.addNumber("phone", false);
        schema.fieldset.get(1).field.addCommentfield( false);

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
