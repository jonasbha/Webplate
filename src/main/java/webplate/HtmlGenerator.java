package webplate;

import webplate.page.Page;
import webplate.page.component.article.Article;
import webplate.page.component.schema.Schema;

public class HtmlGenerator {

    public String generatePage(int index) {
        StringBuilder builder = new StringBuilder();

        Page page = Webplate.Pages.get(index);

        generateMetadata(builder, page);
        generateBody(builder, page);

        return builder.toString();
    }

    private void generateBody(StringBuilder builder, Page page) {
        builder.append("<body>\n");
        generateHeader(builder);
        builder.append("    <nav>\n");
        builder.append("        <ul>\n");
        for (int i = 0; i < Webplate.Pages.size(); i++) {
            builder.append("            <li>\n");
            builder.append("                <a href=\"path\">").append(Webplate.Pages.get(i).Metadata.getTitle()).append("</a>\n");
            builder.append("            </li>\n");
        }
        builder.append("        </ul>\n");
        builder.append("    </nav>\n");
        generateMain(builder, page);
        generateFooter(builder, page);
        builder.append("</body>\n");
        builder.append("</html>");
    }

    private void generateHeader(StringBuilder builder) {
        builder.append("    <header>\n");
        builder.append("        <h1> Title </h1>\n");
        builder.append("    </header>\n");
    }

    private void generateFooter(StringBuilder builder, Page page) {
        if (page.Feature.getCopyright() != null) {
            builder.append("    <footer>\n");
            builder.append("        <address>\n");
            builder.append("            <p>\n");
            builder.append("                <time datetime=\"<insert date>\">insert date</time>\n");
            builder.append("                &copy; Your name, <a href=\"mailto:<your email>\"> Your email </a>\n");
            builder.append("            </p>\n");
            builder.append("        </address>\n");
            builder.append("    </footer>\n");
        } else
            builder.append("    <footer></footer>\n");
    }

    private void generateMain(StringBuilder builder, Page page) {
        builder.append("    <main>\n");
        for (int p = 0; p < page.Config.getComponents().size(); p++)
            if (page.Config.getComponents().get(p).getClass() == Article.class)
                for (int a = 0; a < page.Article.size(); a++) {
                    builder.append("        <article>\n");
                    builder.append("            <h2> article title </h2>\n");
                    for (int s = 0; s < page.Article.get(a).Section.size(); s++) {
                        builder.append("            <section>\n");
                        builder.append("                <h3> section title </h3>\n");
                        builder.append("                <p> text </p>\n");
                        builder.append("            </section>\n");
                    }
                    builder.append("        </article>\n");
                }
            else if (page.Config.getComponents().get(p).getClass() == Schema.class)
                for (int sc = 0; sc < page.Schema.size(); sc++) {
                    builder.append("        <form>\n");
                    builder.append("            <header>\n");
                    builder.append("                <p><em> form title </em></p>\n");
                    builder.append("            </header>\n");
                    for (int fs = 0; fs < page.Schema.get(sc).Fieldset.size(); fs++) {
                        builder.append("            <fieldset id=\"fieldset").append(fs + 1).append("\">\n");
                        builder.append("                <legend> fieldset title </legend>\n");
                        int textarea = 1, text = 1, number = 1, email = 1, password = 1;
                        for (int f = 0; f < page.Schema.get(sc).Fieldset.get(fs).Field.size(); f++) {
                            switch (page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()) {
                                case "text" :
                                    builder.append("                <p>\n");
                                    builder.append("                    <label for=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()).append(text);
                                    builder.append("\">\n");
                                    builder.append("                        <span>name: </span>\n");
                                    builder.append("                    </label>\n");
                                    builder.append("                    <input type=\"text\" id=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()).append(text);
                                    text++;
                                    builder.append("\" name=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getName());
                                    builder.append("\">\n");
                                    if (page.Schema.get(sc).Fieldset.get(fs).Field.get(f).isRequired())
                                        builder.append("                    <strong style=\"color:red;\"><abbr title=\"required\">*</abbr></strong>\n");
                                    builder.append("                </p>\n");
                                break;
                                case "email":
                                    builder.append("                <p>\n");
                                    builder.append("                    <label for=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()).append(email);
                                    builder.append("\">\n");
                                    builder.append("                        <span>email: </span>\n");
                                    builder.append("                    </label>\n");
                                    builder.append("                    <input type=\"email\" id=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()).append(email);
                                    email++;
                                    builder.append("\" name=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getName());
                                    builder.append("\">\n");
                                    if (page.Schema.get(sc).Fieldset.get(fs).Field.get(f).isRequired())
                                        builder.append("                    <strong style=\"color:red;\"><abbr title=\"required\">*</abbr></strong>\n");
                                    builder.append("                </p>\n");
                                break;
                                case "number" :
                                    builder.append("                <p>\n");
                                    builder.append("                    <label for=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()).append(number);
                                    builder.append("\">\n");
                                    builder.append("                        <span>").append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getName()).append(" number: </span>\n");
                                    builder.append("                    </label>\n");
                                    builder.append("                    <input type=\"number\" id=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()).append(number);
                                    number++;
                                    builder.append("\" name=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getName());
                                    builder.append("_number\" min=\"8\" max=\"8\">\n");
                                    if (page.Schema.get(sc).Fieldset.get(fs).Field.get(f).isRequired())
                                        builder.append("                    <strong style=\"color:red;\"><abbr title=\"required\">*</abbr></strong>\n");
                                    builder.append("                </p>\n");
                                break;
                                case "textarea" :
                                    builder.append("                <p>\n");
                                    builder.append("                    <label for=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()).append(textarea);
                                    builder.append("\">\n");
                                    builder.append("                        <span>write here: </span><br>\n");
                                    builder.append("                    </label>\n");
                                    builder.append("                    <textarea name=\"").
                                            append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getName()).append("\" id=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()).append(textarea);
                                    textarea++;
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getName());
                                    builder.append("\" rows=\"10\" cols=\"50\"></textarea>\n");
                                    if (page.Schema.get(sc).Fieldset.get(fs).Field.get(f).isRequired())
                                        builder.append("                    <strong style=\"color:red;\"><abbr title=\"required\">*</abbr></strong>\n");
                                    builder.append("                </p>\n");
                                break;
                                case "password":
                                    builder.append("                <p>\n");
                                    builder.append("                    <label for=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()).append(password);
                                    builder.append("\">\n");
                                    builder.append("                        <span>password: </span>\n");
                                    builder.append("                    </label>\n");
                                    builder.append("                    <input type=\"password\" id=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getType()).append(password);
                                    password++;
                                    builder.append("\" name=\"");
                                    builder.append(page.Schema.get(sc).Fieldset.get(fs).Field.get(f).getName());
                                    builder.append("\">\n");
                                    if (page.Schema.get(sc).Fieldset.get(fs).Field.get(f).isRequired())
                                        builder.append("                    <strong style=\"color:red;\"><abbr title=\"required\">*</abbr></strong>\n");
                                    builder.append("                </p>\n");
                            }
                        }
                        builder.append("            </fieldset>\n");
                    }
                    builder.append("            <br><br><input type=\"submit\">\n");
                    builder.append("        </form>\n");
                }
        builder.append("    </main>\n");
    }

    private void generateMetadata(StringBuilder builder, Page page) {
        builder.append("<!DOCTYPE html>\n");
        builder.append("<html lang=\"").append(Webplate.Html.getLanguage()).append("\">\n");
        builder.append("<head>\n");
        builder.append("    <meta charset=\"UTF-8\">\n");
        builder.append("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
        if (page.Metadata.getDescription() != null)
            builder.append("\n    <meta name=\"description\"\n" + "          content=\"").append(page.Metadata.getDescription()).append("\">");
        builder.append("\n    <link media=\"screen\" href=\"\" rel=\"stylesheet\" type=\"text/css\">".repeat(Math.max(0, page.Metadata.getStylesheet())));
        builder.append("\n    <title>").append(page.Metadata.getTitle()).append("</title>\n");
        builder.append("</head>\n");
    }
}
