package jizdnirady.jdf;

import jizdnirady.jdf.dto.JdfObject;

public class JdfMapperException extends RuntimeException {

    private Class jdfObjectClass;

    public JdfMapperException() {}

    public JdfMapperException(Class clazz) {
        this.jdfObjectClass = clazz;
    }

    public JdfMapperException(String message) {
        super(message);
    }

    public JdfMapperException(String message, Class clazz) {
        super(message);
        this.jdfObjectClass = clazz;
    }


    public JdfMapperException(String message, Throwable cause, Class clazz) {
        super(message, cause);
        this.jdfObjectClass = clazz;
    }

    public JdfMapperException(String message, Throwable cause) {
        super(message, cause);
    }

    public JdfMapperException(Throwable cause) {
        super(cause);
    }

    public JdfMapperException(Throwable cause, Class clazz) {
        super(cause);
        this.jdfObjectClass = clazz;
    }

    public JdfMapperException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public Class getJdfObjectClass() {
        return jdfObjectClass;
    }

}
