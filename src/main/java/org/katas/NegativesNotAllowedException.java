package org.katas;

public class NegativesNotAllowedException extends RuntimeException {
    public NegativesNotAllowedException(String message) {
        super(message);
    }
}
