package webplate.list;

import webplate.page.component.property.FieldSet;

public class FieldsetList extends ExtendedList<FieldSet> {

    public void add() {
        this.add(new FieldSet());
    }

    public void add(int fieldsets) {
        for (int i = 0; i < fieldsets; i++)
            this.add(new FieldSet());
    }
}
