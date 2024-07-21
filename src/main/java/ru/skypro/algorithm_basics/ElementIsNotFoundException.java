package ru.skypro.algorithm_basics;

public class ElementIsNotFoundException extends RuntimeException {
    public ElementIsNotFoundException() {
    }

    public ElementIsNotFoundException(String message) {
        super(message);
    }

    public ElementIsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public ElementIsNotFoundException(Throwable cause) {
        super(cause);
    }

    public ElementIsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
