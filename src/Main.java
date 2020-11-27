import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        ArrayList<Skill> allSkills = new ArrayList<Skill>();
//        allSkills.add(new Skill("почувствовали ","себя непринужденнее."));
//        allSkills.add(new Skill("бросились", " к нему c "));
//        Thing dishes = new Thing(ThingType.DISHES);
//        Human all = new Human("Все ", allSkills, dishes);
//        System.out.println(all.getName() + all.getSkills().get(0).getName() + all.getSkills().get(0).getInfo());
//
//        Thing feast = new Thing(ThingType.FEAST, "Немного погодя ", " было в полном разгаре.");
//        System.out.println(feast.getDescription() + feast.getName() + feast.getAction());
//
//        Thing tables = new Thing(ThingType.TABLE, " маленькими освещенными");
//        Place garden = new Place("Cад", "Да что там ");
//        Place field = new Place( "Долина", "вся была уставлена", tables);
//        System.out.println(garden.getInfo() + garden.miniMap() + ", " + field.getMap() + tables.getDescription() + tables.getName() + '.');
//
//        Thing rocket = new Thing(ThingType.ROCKET, " описывая величественную дугу, взмыла в беспредельную высь", "рассыпалась", " дождём белых звезд.");
//        System.out.println(rocket.getName() + rocket.getDescription() + " и " + rocket.getAction() + rocket.getHow());
//
//        Thing starsRain = new Thing(ThingType.STARS, " стал тихо-тихо", " падать", " на долину.");
//        System.out.println(starsRain.getName() + starsRain.getDescription() + starsRain.getAction() + starsRain.getHow());
//
//        ArrayList<Skill> bugSkills = new ArrayList<Skill>();
//        bugSkills.add(new Skill(" повернулись", " носами к "));
//        bugSkills.add(new Skill(" и закричали", " \"ура!\". Ах, как чудесно это было!"));
//        Bug bugs = new Bug("Букашки-таракашки", bugSkills);
//        System.out.println(bugs.getName() + bugs.getSkills().get(0).getName() + bugs.getSkills().get(0).getInfo() + starsRain.getName() + bugs.getSkills().get(1).getName() + bugs.getSkills().get(1).getInfo());
//
//        Thing fountain = new Thing(ThingType.FOUNTAIN, " серебряный ", "Забил");
//        System.out.print(fountain.getAction() + fountain.getDescription() + fountain.getName() + ",");
//
//        Thing storm = new Thing(ThingType.STORM, " бенгальская ", " замела", " над верхушками деревьев");
//        System.out.println(storm.getAction() + storm.getHow() + storm.getDescription() + storm.getName());
//
//        ArrayList<Skill> dadskils = new ArrayList<Skill>();
//        dadskils.add(new Skill(" выкатил на"));
//        dadskils.add(new Skill(" наполнил ", " каждому"));
//        Place road = new Place(" дорожку", "садовую");
//        Thing barrel = new Thing(ThingType.BARREL, " большую ", "", " с пуншем.");
//        Human dad = new Human("Муми-папа", dadskils, barrel, dishes);
//        System.out.println(dad.getName() + dad.getSkills().get(0).getName() + road.getMap() + dad.getTo());
//
//        System.out.println(all.getName() + all.getSkills().get(1).getName() + all.getSkills().get(1).getInfo() + dishes.getName() + ".");
//
//        System.out.print(dad.getName() + dad.getSkills().get(1).getInfo() + dad.getSkills().get(1).getName() + dad.getSecond() + ",");
//
//        Thing cup = new Thing(ThingType.CUP, " будь то ");
//        System.out.print(cup.getDescription() + cup.getName() + ",");
//
//        Thing glass = new Thing(ThingType.WINEGLASS, " или ");
//        System.out.print(glass.getDescription() + glass.getName() + ",");
//
//        Thing goblet = new Thing(ThingType.GOBLET, " берестяной ");
//        System.out.print(goblet.getDescription() + goblet.getName() + ",");
//
//        Thing conch = new Thing(ThingType.CONCH, " или ");
//        System.out.print(conch.getDescription() + conch.getName());
//
//        Thing paper = new Thing(ThingType.SHEET, " или", " свернутый фунтиком");
//        System.out.print(paper.getDescription() + paper.getAction() + paper.getName() + ".");

        Quote horn = new Quote() {
            @Override
            public String quote(String text) {
                return "\"" + text + "\"";
            }
        };

        ArrayList<Skill> broSkills = new ArrayList<Skill>();
        broSkills.add(new Skill(" прошли ","Ровно в двенадцать "));
        broSkills.add(new Skill(" нашли "));
        Place garden = new Place("Сад.", "через ");
        Thing suitcase = new Thing(" чемодан."," свой");
        Thing it = new Thing("Её");
        Human brother = new Human("Тофсла", "Вифла", broSkills, it, suitcase);
        ArrayList<Skill> birdSkills = new ArrayList<Skill>();
        birdSkills.add(new Skill("заметил "));
        birdSkills.add(new Skill(" разнес "));
        Animal bird = new Animal("ястреб", birdSkills);
        Thing news = new Thing("весть ");
        Place field = new Place("долина");
        Place.Time.setTime(" тотчас ");
        System.out.println(brother.getPartner() + Place.Time.getTime() + bird.getSkills().get(0).getName() + bird.getName() + " и" + bird.getSkills().get(1).getName() + news.getName() + "по" + field.miniMap());

        Place lasts = new Place("концы", "Во все");
        Thing telegram = new Thing("телеграммы.", "", " полетели ");
        System.out.println(lasts.getMap() + telegram.getAction() + telegram.getName());
        System.out.println(horn.quote("СУМКА МУМИ-МАМЫ НАЙДЕНА!"));
        System.out.println(brother.getTo() + brother.getSkills().get(1).getName() + brother.getPartner() + "!");

        Human jojo = new Human("", broSkills);
        System.out.println(jojo.getName());
        Place city = new Place("Павлодар");
        System.out.println(city.getMap());


    }

}

