package webplate.page.component.schema;

import webplate.page.component.Component;
import webplate.page.component.ComponentList;

public class Schema extends Component {

    public Schema.Config Config = new Config();
    public FieldsetList Fieldset = new FieldsetList();

    public Schema() {
        Fieldset.Config.schema = this;
        Config.schema = this;
    }

    public static class Config extends ComponentConfig<SchemaList> {

        protected Schema schema;

        protected Schema getSchema() {
            return schema;
        }

        protected void setSchema(Schema schema) {
            this.schema = schema;
        }

        @Override
        protected void setList(SchemaList list) {
            this.list = list;
        }

        @Override
        public boolean isCustomizable() {
            return schema.Config.customizable;
        }

        @Override
        public void addToBottomOfPage() {
            ComponentList.Config.getPage().Config.getComponents().remove(schema);
            ComponentList.Config.getPage().Config.getComponents().add(schema);
        }
    }
}
