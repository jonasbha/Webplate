package webplate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import webplate.page.Page;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Testing_generation_of_HTML {

    @Test
    public void see_string() {
        Page page = new Page("Title");
        page.article.addDefault();

        Webplate.pages.add(page);
        System.out.println(Webplate.html.create());
    }

    @Test
    public void verify_html_of_default_template() throws IOException, URISyntaxException {
        Page page = new Page("Title");
        page.article.addDefault();
        Webplate.pages.add(page);

        String expected = getDefaultArticle();
        String actual = Webplate.html.create();

        Assertions.assertEquals(expected, actual);
    }

    private String getDefaultArticle() throws URISyntaxException, IOException {
        Path path = Paths.get(Objects.requireNonNull(getClass().getClassLoader().getResource("defaultArticle.html")).toURI());
        byte[] fileBytes = Files.readAllBytes(path);
        String expected = new String(fileBytes);
        expected = expected.replaceAll("\\r\\n", "\n");
        return expected;
    }
}
