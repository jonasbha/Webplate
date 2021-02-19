package website.page.component.property;

public class FieldGroup {

    FieldSetGroup group;

    public FieldGroup(FieldSetGroup fieldSetGroup) {
        this.group = fieldSetGroup;
    }

    public void add(String type) {}

    public void add(String type, boolean required) {}
}
