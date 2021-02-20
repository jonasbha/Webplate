package webplate.config;

public class SchemaConfig extends ComponentConfig {

    private boolean customizable = false;

    public boolean isCustomizable() {
        return customizable;
    }

    public void setDefault(boolean defaultStructure, boolean customizable) {
        this.setDefault(defaultStructure);
        this.customizable = customizable;
    }

}
