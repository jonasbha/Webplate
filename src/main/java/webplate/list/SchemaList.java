package webplate.list;

import webplate.exception.ExceptionFactory;
import webplate.page.component.Schema;

public class SchemaList extends ComponentList<Schema> {

    @Override
    public void addEmpty() {
        Schema schema = new Schema();
        schema.config.setList(this);
        schema.config.setDefault(false);
        schema.config.addToBottomOfPage();
        this.addToRear(schema);
    }

    @Override
    public void addDefault() {
        Schema schema = new Schema();
        schema.config.setList(this);
        schema.config.setDefault(true);
        schema.config.addToBottomOfPage();
        this.addToRear(schema);
    }

    @Override
    public void addDefault(boolean customizable) {
        Schema schema = new Schema();
        schema.config.setList(this);
        schema.config.setDefault(true);
        schema.config.setCustomizable(customizable);
        schema.config.addToBottomOfPage();
        this.addToRear(schema);
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
