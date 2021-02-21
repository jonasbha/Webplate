package webplate.exception;

public class ExceptionFactory extends Exception {

    public void notCustomizable() {
        throw new IllegalStateException("This is a default schema that is not set as customizable. " +
                "You can activate customization in the schema.");
    }
}
