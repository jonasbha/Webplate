package Pages;

import Pages.Components.Component;
import Pages.Features.Feature;

public abstract class Page {
    String title;
    String description;
    Component[] components;
    Feature[] features;

    Page(String title) {

    }

    public abstract void generateHTML();

    public void addHashtag(String hashtag) {

    }

    public void addComponent() {

    }

    public void addFeature(String feature) {

    }

}
