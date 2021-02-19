package website.page.component;

import website.page.component.property.FieldSetGroup;

public class Schema {

    public FieldSetGroup fieldset;
    private SchemaGroup group;

    public Schema(SchemaGroup group) {
        fieldset = new FieldSetGroup(this);
        this.group = group;
        this.fieldset.add();
    }
    public Schema (SchemaGroup group, int sections) {
        fieldset = new FieldSetGroup(this);
        this.group = group;
        this.fieldset.add(sections);
    }

}
