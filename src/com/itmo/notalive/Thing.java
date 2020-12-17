package com.itmo.notalive;

public class Thing {

    private String name;
    private String description;
    private String action;
    private String how;
    private Thing to;

    public Thing(String name) {
        this.name = name;
    }

    public Thing(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Thing(String name, String description, String action) {
        this.name = name;
        this.action = action;
        this.description = description;
    }

    public Thing(String name, String description, String action, String how) {
        this.name = name;
        this.action = action;
        this.description = description;
        this.how = how;
    }

    public Thing(String name, String description, String action, String how, Thing to) {
        this.name = name;
        this.action = action;
        this.description = description;
        this.how = how;
        this.to = to;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description == null ? "" : description;

    }

    public String getAction() {
        return action == null ? "" : action;
    }

    public String getHow() {
        return how == null ? "" : how;
    }

    public Thing getTo() {
        return to;
    }

}