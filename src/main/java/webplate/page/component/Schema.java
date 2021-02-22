package webplate.page.component;

import webplate.config.SchemaConfig;
import webplate.list.FieldsetList;

public class Schema extends Component {

    public SchemaConfig config = new SchemaConfig();
    public FieldsetList fieldset = new FieldsetList();

    public Schema() {
        super();
        fieldset.config.setSchema(this);
        config.setSchema(this);
    }
}
