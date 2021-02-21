import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webplate.page.Page;

public class Testing_list_functionality {

    Page page;

    @BeforeEach
    public void initPage() {
        page = new Page("title");
    }

    @AfterEach
    public void resetOrderOfComponents() {
        for (int i = 0; i < page.schema.config.getPosition(); i++)
        page.schema.config.decrementPosition();
    }

    @Test
    public void components_are_added_in_correct_order() {
        page.schema.addDefault();
        page.article.addEmpty();
        page.schema.addEmpty();
        page.article.addDefault();

        Assertions.assertEquals(1, page.schema.get(0).getPosition());
        Assertions.assertEquals(2, page.article.get(0).getPosition());
        Assertions.assertEquals(3, page.schema.getLast().getPosition());
        Assertions.assertEquals(4, page.article.getLast().getPosition());
    }

    @Test
    public void user_can_choose_default_or_empty_component_component() {
        page.article.addDefault();
        page.schema.addEmpty();

        Assertions.assertFalse(page.schema.get(0).config.isDefault());
        Assertions.assertTrue(page.article.get(0).config.isDefault());
    }

    @Test
    public void exception_occurs_when_customizing_a_non_customizable_default_component() {
        page.schema.addDefault(false);

        Assertions.assertThrows(IllegalStateException.class, () -> page.schema.get(0).fieldset.add());
        Assertions.assertEquals(0, page.schema.get(0).fieldset.size());
    }

    @Test
    public void exception_do_not_occur_when_customizing_a_customizable_default_component() {
        page.schema.addDefault(true);
        page.schema.addDefault(true);
        page.schema.get(1).fieldset.add();
        Assertions.assertEquals(1, page.schema.getLast().fieldset.size());
    }

    @Test
    public void customizable_is_false_as_default_when_creating_default_component() {
        page.schema.addDefault();
        Assertions.assertThrows(IllegalStateException.class, () -> page.schema.getLast().fieldset.add());
    }


    @Test
    public void component_order_is_reset_after_removeAll() {
        page.schema.addDefault();
        page.article.addDefault();
        page.schema.addEmpty();

        Assertions.assertEquals(1, page.schema.config.getPosition());
    }

    /*
    Trade static counter for componentlist
    integrate component in arraylist
    remove unneccesary functions from api like getPosition
    find new list exceptions
    page.article.removeLast();
    page.schema.remove(2);

 */
}
