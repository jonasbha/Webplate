package webplate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import webplate.page.Page;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public class Testing_generation_of_HTML {

    Page page;

    @BeforeEach
    public void initPage() {
        page = new Page("Title");
    }

    @Test
    public void verify_html_of_default_article_template() throws IOException, URISyntaxException {
        page.article.addDefault();
        Webplate.pages.add(page);

        String expected = getHtml("defaultArticle.html");
        String actual = new HtmlGenerator().generatePage(0);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void verify_html_of_default_schema_template() throws IOException, URISyntaxException {
        page.schema.addDefault();
        Webplate.pages.add(page);

        String expected = getHtml("defaultSchema.html");
        String actual = new HtmlGenerator().generatePage(0);

        Assertions.assertEquals(expected, actual);
    }

    private String getHtml(String resource) throws URISyntaxException, IOException {
        Path path = Paths.get(Objects.requireNonNull(getClass().getClassLoader().getResource(resource)).toURI());
        byte[] fileBytes = Files.readAllBytes(path);
        String expected = new String(fileBytes);
        expected = expected.replaceAll("\\r\\n", "\n");
        return expected;
    }
}
