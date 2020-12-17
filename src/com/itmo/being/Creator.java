package com.itmo.being;

import java.util.ArrayList;
import java.util.List;
import com.itmo.exception.*;
import com.itmo.spell.Spell;

public abstract class Creator {

    private String name;

    private List<Spell> skills;

    public void setSkills(List<Spell> spells) {
        this.skills = spells;
    }

    public List<Spell> getSkills() {
        return skills;
    }

    protected Creator() {
        skills = new ArrayList<Spell>();
    }

    protected Creator(String name) {
        this.name = name;
        skills = new ArrayList<Spell>();
    }

    public String getName() {
        try {
            if (name != "") {
                return name;
            } else {
                throw new ExistException("Обнаруженна невиданная хрень ");
            }
        } catch (ExistException ex) {
            return ex.getExc();

        }
    }
}