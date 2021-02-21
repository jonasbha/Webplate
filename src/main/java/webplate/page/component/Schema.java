package webplate.page.component;

import webplate.config.ComponentConfig;
import webplate.list.FieldsetList;

public class Schema extends Component {

    public FieldsetList fieldset = new FieldsetList();
    public ComponentConfig config = new ComponentConfig();

    public Schema() {
        fieldset.config.setSchema(this);
    }

}
