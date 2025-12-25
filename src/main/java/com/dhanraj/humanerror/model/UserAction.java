package com.dhanraj.humanerror.model;

public class UserAction {

    private String actionName;
    private int timeTaken;

    public UserAction(String actionName, int timeTaken) {
        this.actionName = actionName;
        this.timeTaken = timeTaken;
    }

    public String getActionName() {
        return actionName;
    }

    public int getTimeTaken() {
        return timeTaken;
    }
}
