package com.itmo.spell;

public class Skill implements Spell {

    private String name;
    private String how;

    public Skill(String name) {
        this.name = name;
    }

    public Skill(String name, String how) {
        this.name = name;
        this.how = how;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        if (how == null)
            return "";
        else
            return how;
    }

}