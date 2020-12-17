package com.itmo.being;

import java.util.List;

import com.itmo.spell.*;

public class Animal extends Creator {


    public Animal(String nickname, List<Spell> skillist) {
        super(nickname);
        setSkills(skillist);
    }

}
