package webplate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webplate.page.Page;
import webplate.page.component.article.Article;
import webplate.page.component.schema.Schema;

public class Testing_list_functionality {

    Page page;

    @BeforeEach
    public void initPage() {
        page = new Page("title");
    }

    @Test
    public void components_are_added_in_correct_order() {
        page.Article.addEmpty();
        page.Schema.addEmpty();
        page.Article.addDefault();

        Assertions.assertEquals(Article.class, page.Config.getComponents().get(0).getClass());
        Assertions.assertEquals(Schema.class, page.Config.getComponents().get(1).getClass());
        Assertions.assertEquals(Article.class, page.Config.getComponents().get(2).getClass());
    }

    @Test
    public void default_component_is_predefined() {
        page.Article.addDefault();
        page.Schema.addDefault();

        Assertions.assertEquals(2, page.Article.getLast().Section.size());
        Assertions.assertEquals(2, page.Schema.getLast().Fieldset.size());
        Assertions.assertEquals(1, page.Schema.getLast().Fieldset.getLast().Field.size());
    }

    @Test
    public void exception_occurs_when_customizing_a_non_customizable_default_component() {
        page.Schema.addDefault(false);

        Assertions.assertThrows(IllegalStateException.class, () -> page.Schema.getLast().Fieldset.add());
        Assertions.assertEquals(2, page.Schema.getLast().Fieldset.size());
    }

    @Test
    public void exception_do_not_occur_when_customizing_a_customizable_default_component() {
        page.Schema.addDefault(true);
        page.Schema.addDefault(true);
        page.Schema.getLast().Fieldset.add();
        Assertions.assertEquals(3, page.Schema.getLast().Fieldset.size());
    }

    @Test
    public void customizable_is_false_as_default_when_creating_default_component() {
        page.Article.addDefault();
        Assertions.assertThrows(IllegalStateException.class, () -> page.Article.getLast().Section.add());
    }

    @Test
    public void customizable_is_always_true_when_creating_empty_component() {
        page.Article.addEmpty();
        page.Article.getLast().Section.add();
        Assertions.assertEquals(1, page.Article.size());
    }

    @Test
    public void customizable_can_be_set_after_initialization_when_creating_default_component() {
        page.Schema.addDefault(false);
        page.Schema.getLast().Config.setCustomizable(true);

        page.Schema.getLast().Fieldset.add();
        Assertions.assertEquals(3, page.Schema.getLast().Fieldset.size());
    }

    @Test
    public void removeLast_removes_the_last_element_in_all_associated_lists() {
        page.Schema.addEmpty();
        page.Schema.addDefault();
        page.Article.addEmpty();

        page.Schema.removeLast();

        Assertions.assertEquals(1, page.Schema.size());
        Assertions.assertEquals(2, page.Config.getComponents().size());
        Assertions.assertEquals(Article.class, page.Config.getComponents().get(page.Config.getComponents().size()-1).getClass());
    }

    @Test
    public void removeAll_removes_components_in_all_associated_lists() {
        page.Schema.addDefault();
        page.Article.addEmpty();
        page.Schema.addDefault();

        page.Schema.removeAll();

        Assertions.assertEquals(0, page.Schema.size());
        Assertions.assertEquals(1, page.Config.getComponents().size());
    }

    @Test
    public void all_properties_within_a_category_can_be_removed_from_list_at_once() {
        page.Schema.addEmpty();
        page.Schema.getLast().Fieldset.add();
        page.Schema.getLast().Fieldset.getLast().Field.addText("Name");

        page.Schema.getLast().Fieldset.getLast().Field.removeAll();
        Assertions.assertEquals(0, page.Schema.getLast().Fieldset.getLast().Field.size());

        page.Schema.getLast().Fieldset.removeAll();
        Assertions.assertEquals(0, page.Schema.getLast().Fieldset.size());
    }

    @Test
    public void section_can_be_added_to_specified_article() {
        page.Article.addEmpty();
        page.Article.addEmpty();
        page.Article.addEmpty();
        page.Article.get(1).Section.add();

        Assertions.assertEquals(1, page.Article.get(1).Section.size());
    }

    @Test
    public void section_can_be_removed_from_specified_article() {
        page.Article.addEmpty();
        page.Article.getLast().Section.add();
        page.Article.getLast().Section.removeLast();

        Assertions.assertEquals(0, page.Article.getLast().Section.size());
    }

    @Test
    public void all_sections_can_be_removed_from_specified_article_at_once() {
        page.Article.addEmpty();

        page.Article.getLast().Section.add(3);
        Assertions.assertEquals(3, page.Article.getLast().Section.size());

        page.Article.getLast().Section.removeAll();
        Assertions.assertEquals(0, page.Article.getLast().Section.size());
    }

    @Test
    public void a_feature_can_be_added_to_a_page() {
        page.Feature.addCopyright("Owner");

        Assertions.assertEquals("Owner", page.Feature.getCopyright().getOwner());
    }

    @Test
    public void pages_can_be_added_and_removed_from_Webplate() {
        Page page2 = new Page("title");
        Webplate.Pages.add(page);
        Webplate.Pages.add(page2);
        Webplate.Pages.remove(page2);

        Assertions.assertEquals(1, Webplate.Pages.size());
    }
}
