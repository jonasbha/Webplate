package webplate.page.feature;

public class Feature  {

    private Copyright copyright;

    public void addCopyright() {
        copyright = new Copyright();
    }

    public void addCopyright(String owner) {
        copyright = new Copyright(owner);
    }

    public Copyright getCopyright() {return this.copyright;}
}
