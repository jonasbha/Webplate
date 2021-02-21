package webplate.page.component;

public abstract class Component {

    private int position;

    public Component() {}

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
