package webplate.config;

public abstract class ComponentConfig<E> {

    public E list;

    abstract public void setList(E list);

    abstract public E getList();

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

    public void setCustomizable(boolean customizable) {
        this.customizable = customizable;
    }

    public void setDefault(boolean defaultStructure, boolean customizable) {
        this.defaultStructure = defaultStructure;
        this.customizable = customizable;
    }
}
