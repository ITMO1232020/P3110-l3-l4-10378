package com.itmo.being;

import java.util.List;
import com.itmo.notalive.*;
import com.itmo.spell.*;

public class Human extends Creator {

    private Thing to;
    private Thing second;
    private Partner bro;
    private static final boolean config = true;

    public Human() {
    }

    public Human(String name, List<Spell> skillist) {
        super(name);
        setSkills(skillist);
    }

    public Human(String name, List<Spell> skillist, Thing to) {
        super(name);
        setSkills(skillist);
        this.to = to;
    }

    public Human(String name, List<Spell> skillist, Thing to, Thing second) {
        super(name);
        setSkills(skillist);
        this.to = to;
        this.second = second;
    }

    public Human(String name, String partner, List<Spell> skillist, Thing to, Thing second) {
        super(name);
        setSkills(skillist);
        this.to = to;
        this.second = second;
        bro = new Partner(partner);
    }



    public class Partner {

        private String partnerName;

        public Partner(String partnerName) {
            this.partnerName = partnerName;
        }

        public String getPartnerName() {
            return partnerName;
        }
    }
    final int a = 1; //ЭТО ПОЛЕ ВО ВНЕШНЕМ КЛАССЕ Human
    public String getPartner() {

        class Local {//
            final int a = 2; // ЭТО ПОЛЕ ЛОКАЛЬНОГО КЛАССА Local
            String shift() {
                System.out.println(Human.this.a);
                System.out.println(a);
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
