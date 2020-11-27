import java.util.ArrayList;

public class Human extends Creater {

    private ArrayList<Skill> skills = new ArrayList<Skill>();
    private Thing to;
    private Thing second;
    private Partner bro;
    private final boolean config = true;

    public Human() {
    }

    public Human(String nickname, ArrayList<Skill> skillist) {
        super(nickname);
        skills = skillist;
    }

    public Human(String nickname, ArrayList<Skill> skillist, Thing tothing) {
        super(nickname);
        skills = skillist;
        to = tothing;
    }

    public Human(String nickname, ArrayList<Skill> skillist, Thing tothing, Thing secondthing) {
        super(nickname);
        skills = skillist;
        to = tothing;
        second = secondthing;
    }

    public Human(String nickname, String partner,ArrayList<Skill> skillist, Thing tothing, Thing secondthing) {
        super(nickname);
        skills = skillist;
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

    public ArrayList<Skill> getSkills() {
        return skills;
    }
}
