package webplate.page.component;

public abstract class Component {

    public static abstract class ComponentConfig<E> {

        protected E list;

        protected boolean customizable = true;

        abstract protected void setList(E list);

        public abstract boolean isCustomizable();

        public void setCustomizable(boolean customizable) {
            this.customizable = customizable;
        }

        public abstract void addToBottomOfPage();
    }
}
