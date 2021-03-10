package webplate.page.component.schema;

import webplate.exception.ExceptionFactory;
import webplate.page.component.ComponentList;

public class SchemaList extends ComponentList<Schema> {


    @Override
    public Schema addEmpty() {
        Schema schema = new Schema();
        schema.Config.setList(this);
        schema.Config.setCustomizable(true);
        schema.Config.addToBottomOfPage();
        this.addToRear(schema);
        return schema;
    }

    @Override
    public Schema addDefault() {
        Schema schema = new Schema();
        schema.Fieldset.add();
        schema.Fieldset.add();
        schema.Fieldset.get(0).Field.addText("username", true);
        schema.Fieldset.get(0).Field.addEmail(true);
        schema.Fieldset.get(0).Field.addNumber("phone", false);
        schema.Fieldset.get(1).Field.addCommentfield( false);

        schema.Config.setCustomizable(false);
        schema.Config.setList(this);
        schema.Config.addToBottomOfPage();
        this.addToRear(schema);
        return schema;
    }

    @Override
    public Schema addDefault(boolean customizable) {
        Schema schema = new Schema();
        schema.Fieldset.add();
        schema.Fieldset.add();
        schema.Fieldset.get(0).Field.addText("username", true);
        schema.Fieldset.get(0).Field.addEmail(true);
        schema.Fieldset.get(0).Field.addNumber("phone", false);
        schema.Fieldset.get(1).Field.addCommentfield( false);

        schema.Config.setList(this);
        schema.Config.setCustomizable(customizable);
        schema.Config.addToBottomOfPage();
        this.addToRear(schema);
        return schema;
    }

    @Override
    public void removeAll() {
        removeAllItems();
        for (int i = 0; i < page.Config.getComponents().size(); i++)
            if (page.Config.getComponents().get(i).getClass() == Schema.class)
                page.Config.getComponents().remove(i);
    }

    @Override
    public void removeLast() {
        if (this.isEmpty()) {
            new ExceptionFactory().emptyCollection("schema");
        }
        int last = page.Config.getComponents().size()-1;
        int size = page.Config.getComponents().size();

        while (page.Config.getComponents().size() == size) {
            if (page.Config.getComponents().get(last).getClass() == Schema.class) {
                page.Config.getComponents().remove(last);
                removeLastItem();
            } else
                last--;
        }
    }
}
