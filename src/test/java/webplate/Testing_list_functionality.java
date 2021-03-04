package webplate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webplate.page.Page;
import webplate.page.component.Article;
import webplate.page.component.Schema;

public class Testing_list_functionality {

    Page page;

    @BeforeEach
    public void initPage() {
        page = new Page("title");
    }

    @Test
    public void components_are_added_in_correct_order() {
        page.article.addEmpty();
        page.schema.addEmpty();
        page.article.addDefault();

        Assertions.assertEquals(Article.class, page.config.getComponents().get(0).getClass());
        Assertions.assertEquals(Schema.class, page.config.getComponents().get(1).getClass());
        Assertions.assertEquals(Article.class, page.config.getComponents().get(2).getClass());
    }

    @Test
    public void default_component_is_predefined() {
        page.article.addDefault();
        page.schema.addDefault();

        Assertions.assertEquals(2, page.article.getLast().section.size());
        Assertions.assertEquals(2, page.schema.getLast().fieldset.size());
        Assertions.assertEquals(1, page.schema.getLast().fieldset.getLast().field.size());
    }

    @Test
    public void exception_occurs_when_customizing_a_non_customizable_default_component() {
        page.schema.addDefault(false);

        Assertions.assertThrows(IllegalStateException.class, () -> page.schema.getLast().fieldset.add());
        Assertions.assertEquals(2, page.schema.getLast().fieldset.size());
    }

    @Test
    public void exception_do_not_occur_when_customizing_a_customizable_default_component() {
        page.schema.addDefault(true);
        page.schema.addDefault(true);
        page.schema.getLast().fieldset.add();
        Assertions.assertEquals(3, page.schema.getLast().fieldset.size());
    }

    @Test
    public void customizable_is_false_as_default_when_creating_default_component() {
        page.article.addDefault();
        Assertions.assertThrows(IllegalStateException.class, () -> page.article.getLast().section.add());
    }

    @Test
    public void customizable_is_always_true_when_creating_empty_component() {
        page.article.addEmpty();
        page.article.getLast().section.add();
        Assertions.assertEquals(1, page.article.size());
    }

    @Test
    public void customizable_can_be_set_after_initialization_when_creating_default_component() {
        page.schema.addDefault(false);
        page.schema.getLast().config.setCustomizable(true);

        page.schema.getLast().fieldset.add();
        Assertions.assertEquals(3, page.schema.getLast().fieldset.size());
    }

    @Test
    public void removeLast_removes_the_last_element_in_all_associated_lists() {
        page.schema.addEmpty();
        page.schema.addDefault();
        page.article.addEmpty();

        page.schema.removeLast();

        Assertions.assertEquals(1, page.schema.size());
        Assertions.assertEquals(2, page.config.getComponents().size());
        Assertions.assertEquals(Article.class, page.config.getComponents().get(page.config.getComponents().size()-1).getClass());
    }

    @Test
    public void removeAll_removes_components_in_all_associated_lists() {
        page.schema.addDefault();
        page.article.addEmpty();
        page.schema.addDefault();

        page.schema.removeAll();

        Assertions.assertEquals(0, page.schema.size());
        Assertions.assertEquals(1, page.config.getComponents().size());
    }

    @Test
    public void all_properties_within_a_category_can_be_removed_from_list_at_once() {
        page.schema.addEmpty();
        page.schema.getLast().fieldset.add();
        page.schema.getLast().fieldset.getLast().field.add("Name");

        page.schema.getLast().fieldset.getLast().field.removeAll();
        Assertions.assertEquals(0, page.schema.getLast().fieldset.getLast().field.size());

        page.schema.getLast().fieldset.removeAll();
        Assertions.assertEquals(0, page.schema.getLast().fieldset.size());
    }

    @Test
    public void section_can_be_added_to_specified_article() {
        page.article.addEmpty();
        page.article.addEmpty();
        page.article.addEmpty();
        page.article.get(1).section.add();

        Assertions.assertEquals(1, page.article.get(1).section.size());
    }

    @Test
    public void section_can_be_removed_from_specified_article() {
        page.article.addEmpty();
        page.article.getLast().section.add();
        page.article.getLast().section.removeLast();

        Assertions.assertEquals(0, page.article.getLast().section.size());
    }

    @Test
    public void all_sections_can_be_removed_from_specified_article_at_once() {
        page.article.addEmpty();

        page.article.getLast().section.add(3);
        Assertions.assertEquals(3, page.article.getLast().section.size());

        page.article.getLast().section.removeAll();
        Assertions.assertEquals(0, page.article.getLast().section.size());
    }

    @Test
    public void a_feature_can_be_added_to_a_page() {
        page.feature.addCopyright("Owner");

        Assertions.assertEquals("Owner", page.feature.getCopyright().getOwner());
    }

    @Test
    public void pages_can_be_added_and_removed_from_Webplate() {
        Page page2 = new Page("title");
        Webplate.pages.add(page);
        Webplate.pages.add(page2);
        Webplate.pages.remove(page2);

        Assertions.assertEquals(1, Webplate.pages.size());
    }
}
