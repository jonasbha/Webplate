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
    public void user_can_choose_default_or_empty_component_component() {
        page.article.addDefault();
        page.schema.addEmpty();

        Assertions.assertFalse(page.schema.getLast().config.isDefault());
        Assertions.assertTrue(page.article.getArticle(0).config.isDefault());
    }

    @Test
    public void exception_occurs_when_customizing_a_non_customizable_default_component() {
        page.schema.addDefault(false);

        Assertions.assertThrows(IllegalStateException.class, () -> page.schema.getLast().fieldset.add());
        Assertions.assertEquals(0, page.schema.getLast().fieldset.size());
    }

    @Test
    public void exception_do_not_occur_when_customizing_a_customizable_default_component() {
        page.schema.addDefault(true);
        page.schema.addDefault(true);
        page.schema.getLast().fieldset.add();
        Assertions.assertEquals(1, page.schema.getLast().fieldset.size());
    }

    @Test
    public void customizable_is_false_as_default_when_creating_default_component() {
        page.article.addDefault();
        Assertions.assertThrows(IllegalStateException.class, () -> page.article.getLast().section.add());
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

    /*
    add descriptions like in the list.

    fortsett med testing:
    page.article.get(2).section.add();
    removeAll
    page.article.removeLast();
    page.schema.remove(2);

 */
}
