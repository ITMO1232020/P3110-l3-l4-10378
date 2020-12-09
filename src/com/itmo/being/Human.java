package com.itmo.being;

import java.util.List;

import com.itmo.notalive.*;
import com.itmo.spell.*;

public class Human extends Creater {

    private Thing to;
    private Thing second;
    private Partner bro;
    private final boolean config = true;

    public Human() {
    }

    public Human(String nickname, List<Spell> skillist) {
        super(nickname);
        setSkills(skillist);
    }

    public Human(String nickname, List<Spell> skillist, Thing tothing) {
        super(nickname);
        setSkills(skillist);
        to = tothing;
    }

    public Human(String nickname, List<Spell> skillist, Thing tothing, Thing secondthing) {
        super(nickname);
        setSkills(skillist);
        to = tothing;
        second = secondthing;
    }

    public Human(String nickname, String partner, List<Spell> skillist, Thing tothing, Thing secondthing) {
        super(nickname);
        setSkills(skillist);
        to = tothing;
        second = secondthing;
        bro = new Partner(partner);
    }



    public class Partner {

        private String partnerName;

        public Partner(String pName) {
            partnerName = pName;
        }

        public String getPartnerName() {
            return partnerName;
        }
    }

    public String getPartner() {
        class Local {
            String shift() {
                if (config) {
                    return getName() + " и " + bro.partnerName;
                } else {
                    return bro.partnerName + " и " + getName();
                }
            }
        }
        Local local = new Local();
        return local.shift();
    }

    public String getTo() {
        return to.getDescription() + to.getName() + to.getHow();
    }

    public String getSecond() {
        return second.getDescription() + second.getName() + second.getHow();
    }

}
