package com.config.exception;

public class AppException extends RuntimeException {
    private static final long serialVersionUID = -7806029002430564887L;
    private String message;

    public AppException() {
    }

    public AppException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}