package com.config.exception;

public class ErrorDetails {
    private String timestamp;
    private String message;
    private String details;
    private int type;

    public enum TYPE {
        Sys(0), App(1);
        private final int type;

        TYPE(int type) {
            this.type = type;
        }

        public int getValue() {
            return type;
        }
    }

    public ErrorDetails(String timestamp, String message, String details, int type) {
        super();
        this.timestamp = timestamp;
        this.message = message;
        this.details = details;
        this.type = type;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }

    public int getType() {
        return type;
    }

}