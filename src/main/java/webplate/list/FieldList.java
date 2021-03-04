package webplate.list;

import webplate.exception.ExceptionFactory;
import webplate.page.component.Schema;
import webplate.page.component.property.Field;

public class FieldList extends ListNamingAbstraction<Field> {

    public Schema.config config = new Schema.config();

    public FieldList addText(String name) {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setName(name);
            field.setType("text");
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }

    public FieldList addText(String name, boolean required) {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setName(name);
            field.setType("text");
            field.setRequired(required);
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }

    public FieldList addNumber() {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setType("number");
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }

    public FieldList addNumber(String type, boolean required) {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setName(type);
            field.setType("number");
            field.setRequired(required);
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }

    public FieldList addEmail() {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setName("email");
            field.setType("email");
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }

    public FieldList addEmail(boolean required) {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setName("email");
            field.setType("email");
            field.setRequired(required);
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }

    public FieldList addCommentfield() {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setType("textarea");
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }

    public FieldList addCommentfield(boolean required) {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setType("textarea");
            field.setName("");
            field.setRequired(required);
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }

    public FieldList addPassword() {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setType("password");
            field.setName("password");
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }

    public FieldList addPassword(boolean required) {
        if (config.isCustomizable()) {
            Field field = new Field();
            field.setType("password");
            field.setName("password");
            field.setRequired(required);
            this.addToRear(field);
            return this;
        } else
            new ExceptionFactory().notCustomizable("schema");
        return null;
    }
}
