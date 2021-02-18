package website.page.component.section;

import website.page.component.Schema;

import java.util.ArrayList;
import java.util.LinkedList;

public class SectionGroup {

    private LinkedList<Section> sections = new LinkedList<>();

    public void add() {};

    public Section get(int i) {
        return sections.get(i);
    }

    public void removeLast() {}
}
