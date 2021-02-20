package webplate.config;

public abstract class ComponentConfig {

    private boolean defaultStructure;

    public boolean isDefault() {
        return defaultStructure;
    }

    public void setDefault(boolean defaultStructure) {
        this.defaultStructure = defaultStructure;
    }
}
