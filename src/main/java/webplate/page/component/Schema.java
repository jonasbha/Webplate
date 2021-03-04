package webplate.page.component;

import webplate.list.FieldsetList;
import webplate.list.SchemaList;

public class Schema extends Component {

    public Schema.config config = new config();
    public FieldsetList fieldset = new FieldsetList();

    public Schema() {
        super();
        fieldset.config.schema = this;
        config.schema = this;
    }

    public static class config extends ComponentConfig<SchemaList> {

        protected Schema schema;

        public Schema getSchema() {
            return schema;
        }

        public void setSchema(Schema schema) {
            this.schema = schema;
        }

        @Override
        public void setList(SchemaList list) {
            this.list = list;
        }

        @Override
        public boolean isCustomizable() {
            return schema.config.customizable;
        }

        @Override
        public void addToBottomOfPage() {
            list.config.getParent().config.getComponents().remove(schema);
            list.config.getParent().config.getComponents().add(schema);
        }
    }
}
