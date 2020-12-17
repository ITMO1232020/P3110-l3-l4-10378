package com.itmo;

import java.util.ArrayList;
import java.util.List;

import com.itmo.being.*;
import com.itmo.notalive.*;
import com.itmo.spell.*;

public class Main {

    public static void main(String[] args) {

        Quote horn = new Quote() {
            @Override
            public String quote(String text) {
                return "\"" + text + "\"";
            }
        };

        List<Spell> broSkills = new ArrayList<Spell>();
        broSkills.add(new Skill(" прошли ","Ровно в двенадцать "));
        broSkills.add(new Skill(" нашли "));

        Place garden = new Place("Сад.", "через ");

        Thing suitcase = new Thing(" чемодан."," свой");
        Thing it = new Thing("Её");

        Human brother = new Human("Тофсла", "Вифла", broSkills, it, suitcase);

        List<Spell> birdSkills = new ArrayList<Spell>();
        birdSkills.add(new Skill("заметил "));
        birdSkills.add(new Skill(" разнес "));
        Animal bird = new Animal("ястреб", birdSkills);
        Thing news = new Thing("весть ");
        Place field = new Place("долина");
        Place.Time.setTime(" тотчас ");
        System.out.println(brother.getPartner() + Place.Time.getTime() + bird.getSkills().get(0).getName() + bird.getName() + " и" + bird.getSkills().get(1).getName() + news.getName() + "по " + field.miniMap());

        Place lasts = new Place("концы", "Во все");
        Thing telegram = new Thing("телеграммы.", "", " полетели ");
        System.out.println(lasts.getMap() + telegram.getAction() + telegram.getName());
        System.out.println(horn.quote("СУМКА МУМИ-МАМЫ НАЙДЕНА!"));
        System.out.println(brother.getTo() + brother.getSkills().get(1).getName() + brother.getPartner() + "!");

        Human jojo = new Human("", broSkills);
        System.out.println(jojo.getName());
        Place city = new Place("Павлодар");
        System.out.println(city.getMap());
        System.out.println(A.getC());

    }


}
class A {

    public static A.B.C getC() {
        B.C boop = new B.C();
        return boop;
    }

    private static class B {

        public static class C {

        }
    }
}

