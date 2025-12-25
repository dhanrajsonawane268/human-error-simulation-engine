package com.dhanraj.humanerror.model;

public class ErrorEvent {

    private UserAction action;
    private ErrorType errorType;
    private String timestamp;

    public ErrorEvent(UserAction action, ErrorType errorType, String timestamp) {
        this.action = action;
        this.errorType = errorType;
        this.timestamp = timestamp;
    }

    public UserAction getAction() {
        return action;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
