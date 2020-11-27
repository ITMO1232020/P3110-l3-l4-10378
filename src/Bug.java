import java.util.ArrayList;

public class Bug extends Creater {

    private ArrayList<Skill> skills = new ArrayList<Skill>();

    public Bug() {
    }

    public Bug(String nickname, ArrayList<Skill> skillset) {
        super(nickname);
        skills = skillset;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }
}
