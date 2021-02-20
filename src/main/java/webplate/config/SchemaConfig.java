package webplate.config;

public class SchemaConfig {

    private boolean defaultStructure;
    private boolean customizable = false;

    public boolean isDefault() {
        return defaultStructure;
    }

    public boolean isCustomizable() {
        return customizable;
    }

    public void setDefault(boolean defaultStructure) {
        this.defaultStructure = defaultStructure;
    }

    public void setDefault(boolean defaultStructure, boolean customizable) {
        this.defaultStructure = defaultStructure;
        this.customizable = customizable;
    }

}
