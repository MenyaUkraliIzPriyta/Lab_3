
package Exceptions;

public class NameOrEmptyException extends RuntimeException {
    public NameOrEmptyException(String errorMessage) {

        super(errorMessage);
    }
}