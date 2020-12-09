package com.itmo.spell;

public class Skill implements Spell {

    private String name;
    private String how;

    public Skill(String naming) {
        name = naming;
    }

    public Skill(String naming, String info) {
        name = naming;
        how = info;
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