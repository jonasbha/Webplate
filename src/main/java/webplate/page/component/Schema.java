package webplate.page.component;

import webplate.list.FieldsetList;

public class Schema extends Component {

    public SchemaConfig config = new SchemaConfig();
    public FieldsetList fieldset = new FieldsetList();

    public Schema() {
        super();
        fieldset.config.schema = this;
        config.schema = this;
    }
}
