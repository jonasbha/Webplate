package webplate;

import webplate.page.Page;
import webplate.page.component.Article;

public class Generator {

    public String generateHTML() {
        StringBuilder builder = new StringBuilder();

        Page page = Webplate.pages.get(0);

        generateMetadata(builder, page);
        generateComponents(builder, page);

        return builder.toString();
    }

    private static void generateComponents(StringBuilder builder, Page page) {
        builder.append("<body>\n");
        for (int a = 0; a < page.config.getComponents().size(); a++)
            if (page.config.getComponents().get(a).getClass() == Article.class)
                for (int b = 0; b < page.article.size(); b++) {
                    builder.append("    <article>\n");
                    builder.append("        <h1></h1>\n");
                    for (int j = 0; j < page.article.getArticle(b).section.size(); j++) {
                        builder.append("        <section>\n");
                        builder.append("            <h2></h2>\n");
                        builder.append("            <p></p>\n");
                        builder.append("        </section>\n");
                    }
                    builder.append("    </article>\n");
                }
        builder.append("</body>\n");
        builder.append("</html>");
    }

    private static void generateMetadata(StringBuilder builder, Page page) {
        builder.append("<!DOCTYPE html>\n");
        builder.append("<html lang=\"").append(page.metadata.getLanguage()).append("\">\n");
        builder.append("<head>\n");
        builder.append("    <meta charset=\"UTF-8\">\n");
        builder.append("    <title>").append(page.metadata.getTitle()).append("</title>\n");
        builder.append("</head>\n");
    }
}
