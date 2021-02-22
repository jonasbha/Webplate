package webplate.config;

public abstract class ComponentConfig<E> {

    protected E list;

    protected boolean customizable = false;

    private boolean defaultStructure;

    abstract public void setList(E list);

    abstract public E getList();

    public boolean isDefault() {
        return defaultStructure;
    }

    public void setDefault(boolean defaultStructure) {
        this.defaultStructure = defaultStructure;
    }

    public abstract boolean isCustomizable();

    public void setCustomizable(boolean customizable) {
        this.customizable = customizable;
    }

    public void setDefault(boolean defaultStructure, boolean customizable) {
        this.defaultStructure = defaultStructure;
        this.customizable = customizable;
    }

    public abstract void addToBottomOfPage();
}
