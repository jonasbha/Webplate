package webplate.config;

public class ComponentConfig {

    private boolean defaultStructure;

    public boolean isDefault() {
        return defaultStructure;
    }

    public void setDefault(boolean defaultStructure) {
        this.defaultStructure = defaultStructure;
    }

    private boolean customizable = false;

    public boolean isCustomizable() {
        return customizable;
    }

    public void setDefault(boolean defaultStructure, boolean customizable) {
        this.defaultStructure = defaultStructure;
        this.customizable = customizable;
    }
}
