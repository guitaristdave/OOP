package homeworks.lesson3.Exceptions;

public class IncorrectTriangleException extends Exception{

    public IncorrectTriangleException() {
    }

    public IncorrectTriangleException(String message) {
        super(message);
    }

    public IncorrectTriangleException(Throwable cause) {
        super(cause);
    }

    public IncorrectTriangleException(String message, Throwable cause) {
        super(message, cause);
    }

    public IncorrectTriangleException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }


}
