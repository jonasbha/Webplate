package webplate.exception;

import java.util.NoSuchElementException;

public class ExceptionFactory extends Exception {

    public void notCustomizable(String component) {
        throw new IllegalStateException("This is a default " + component + " that is not set as customizable. " +
                "You can activate customization in the " + component + " configuration.");
    }

    public void emptyCollection(String collection) {
        throw new EmptyCollectionException(collection);
    }
}
