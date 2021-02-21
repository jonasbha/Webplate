import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webplate.page.Page;
import webplate.page.component.Article;
import webplate.page.component.Component;
import webplate.page.component.Schema;

/*

    trhow exception if trying to customize a non default with no custom.
    page.schema.addDefault(2, true);
    page.schema.addDefault(false);
    page.schema.getLast().config.setDefault(false);
    page.article.removeLast();
    page.schema.remove(2);

 */


public class Testing_list_storage {

    Page page;

    @BeforeEach
    public void initPage() {
        page = new Page("title");
    }

    @Test
    public void components_can_be_added_to_all_involved_lists() {
        page.schema.addDefault();
        page.article.addDefault(2);
        page.schema.addEmpty(2);

        Assertions.assertEquals(3, page.schema.size());
        Assertions.assertEquals(2, page.article.size());
        Assertions.assertEquals(5, page.components.size());
    }

    @Test
    public void components_are_added_in_correct_order() {
        page.article.addDefault();
        page.schema.addEmpty(2);

        Component last = page.components.get(page.components.size()-1);
        Component first = page.components.get(0);

        Assertions.assertEquals(Article.class, first.getClass());
        Assertions.assertEquals(Schema.class, last.getClass());
    }

    @Test
    public void user_can_choose_default_or_empty_component_template() {
        page.article.addDefault();
        page.schema.addEmpty();

        Assertions.assertFalse(page.schema.getFirst().config.isDefault());
        Assertions.assertTrue(page.article.getFirst().config.isDefault());
    }


    @Test
    public void exception_occurs_when_customizing_a_non_customizable_default_template() {
        page.schema.addDefault(false);

        Assertions.assertThrows(IllegalStateException.class, () -> page.schema.getFirst().fieldset.add());
        Assertions.assertEquals(0, page.schema.getFirst().fieldset.size());
    }

    @Test
    public void components_are_removed_in_all_involved_lists() {}


}
