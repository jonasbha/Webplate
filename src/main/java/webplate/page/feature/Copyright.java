package webplate.page.feature;

public class Copyright extends Feature {

    String owner;

    public Copyright() {
    }

    public Copyright(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }
}
