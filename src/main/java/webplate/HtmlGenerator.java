package webplate;

import webplate.page.Page;
import webplate.page.component.Article;
import webplate.page.component.Schema;

public class HtmlGenerator {

    public String generatePage(int index) {
        StringBuilder builder = new StringBuilder();

        Page page = Webplate.pages.get(index);

        generateMetadata(builder, page);
        generateMain(builder, page);

        return builder.toString();
    }

    private static void generateMain(StringBuilder builder, Page page) {
        builder.append("<body>\n");
        builder.append("    <header>\n");
        builder.append("        <h1> Title </h1>\n");
        builder.append("    </header>\n");
        builder.append("    <main>\n");
        generateComponents(builder, page);
        builder.append("    </main>\n");
        builder.append("    <footer></footer>\n");
        builder.append("</body>\n");
        builder.append("</html>");
    }

    private static void generateComponents(StringBuilder builder, Page page) {
        for (int p = 0; p < page.config.getComponents().size(); p++)
            if (page.config.getComponents().get(p).getClass() == Article.class)
                for (int a = 0; a < page.article.size(); a++) {
                    builder.append("        <article>\n");
                    builder.append("            <h2> article title </h2>\n");
                    for (int s = 0; s < page.article.get(a).section.size(); s++) {
                        builder.append("            <section>\n");
                        builder.append("                <h3> section title </h3>\n");
                        builder.append("                <p> text </p>\n");
                        builder.append("            </section>\n");
                    }
                    builder.append("        </article>\n");
                }
            else if (page.config.getComponents().get(p).getClass() == Schema.class)
                for (int sc = 0; sc < page.schema.size(); sc++) {
                    builder.append("        <form>\n");
                    builder.append("            <header>\n");
                    builder.append("                <p><em> form title </em></p>\n");
                    builder.append("            </header>\n");
                    for (int fs = 0; fs < page.schema.get(sc).fieldset.size(); fs++) {
                        builder.append("            <fieldset id=\"fieldset").append(fs + 1).append("\">\n");
                        builder.append("                <legend> fieldset title </legend>\n");
                        for (int f = 0; f < page.schema.get(sc).fieldset.get(fs).field.size(); f++) {
                            int i = 1;
                            switch (page.schema.get(sc).fieldset.get(fs).field.get(f).getType()) {
                                case "text" -> {
                                    builder.append("                <p>\n");
                                    builder.append("                    <label for=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getType()).append(1);
                                    builder.append("\">\n");
                                    builder.append("                        <span>name: </span>\n");
                                    builder.append("                    </label>\n");
                                    builder.append("                    <input type=\"text\" id=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getType()).append(i);
                                    i++;
                                    builder.append("\" name=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getName());
                                    builder.append("\">\n");
                                    if (page.schema.get(sc).fieldset.get(fs).field.get(f).isRequired())
                                        builder.append("                    <strong style=\"color:red;\"><abbr title=\"required\">*</abbr></strong>\n");
                                    builder.append("                </p>\n");
                                }
                                case "email" -> {
                                    builder.append("                <p>\n");
                                    builder.append("                    <label for=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getType()).append(i);
                                    builder.append("\">\n");
                                    builder.append("                        <span>email: </span>\n");
                                    builder.append("                    </label>\n");
                                    builder.append("                    <input type=\"email\" id=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getType()).append(i);
                                    i++;
                                    builder.append("\" name=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getName());
                                    builder.append("\">\n");
                                    if (page.schema.get(sc).fieldset.get(fs).field.get(f).isRequired())
                                        builder.append("                    <strong style=\"color:red;\"><abbr title=\"required\">*</abbr></strong>\n");
                                    builder.append("                </p>\n");
                                }
                                case "number" -> {
                                    builder.append("                <p>\n");
                                    builder.append("                    <label for=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getType()).append(i);
                                    builder.append("\">\n");
                                    builder.append("                        <span>phone number: </span>\n");
                                    builder.append("                    </label>\n");
                                    builder.append("                    <input type=\"number\" id=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getType()).append(i);
                                    i++;
                                    builder.append("\" name=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getName());
                                    builder.append("\" min=\"8\" max=\"8\">\n");
                                    if (page.schema.get(sc).fieldset.get(fs).field.get(f).isRequired())
                                        builder.append("                    <strong style=\"color:red;\"><abbr title=\"required\">*</abbr></strong>\n");
                                    builder.append("                </p>\n");
                                }
                                case "textarea" -> {
                                    builder.append("                <p>\n");
                                    builder.append("                    <label for=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getType()).append(i);
                                    builder.append("\">\n");
                                    builder.append("                        <span>write here: </span><br>\n");
                                    builder.append("                    </label>\n");
                                    builder.append("                    <textarea name=\"").
                                            append(page.schema.get(sc).fieldset.get(fs).field.get(f).getName()).append("\" id=\"");
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getType()).append(i);
                                    i++;
                                    builder.append(page.schema.get(sc).fieldset.get(fs).field.get(f).getName());
                                    builder.append("\" rows=\"10\" cols=\"50\"></textarea>\n");
                                    if (page.schema.get(sc).fieldset.get(fs).field.get(f).isRequired())
                                        builder.append("                    <strong style=\"color:red;\"><abbr title=\"required\">*</abbr></strong>\n");
                                    builder.append("                </p>\n");
                                }
                            }
                        }
                        builder.append("            </fieldset>\n");
                    }
                    builder.append("            <br><br><input type=\"submit\">\n");
                    builder.append("        </form>\n");
                }
    }

    private static void generateMetadata(StringBuilder builder, Page page) {
        builder.append("<!DOCTYPE html>\n");
        builder.append("<html lang=\"").append(page.metadata.getLanguage()).append("\">\n");
        builder.append("<head>\n");
        builder.append("    <meta charset=\"UTF-8\">\n");
        builder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
        builder.append("    <title>").append(page.metadata.getTitle()).append("</title>\n");
        builder.append("</head>\n");
    }
}
