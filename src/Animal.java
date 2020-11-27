import java.util.ArrayList;

public class Animal extends Creater {

    private ArrayList<Skill> skills = new ArrayList<Skill>();

    public Animal(String nickname, ArrayList<Skill> skillset) {
        super(nickname);
        skills = skillset;
    }

    public ArrayList<Skill> getSkills() {
        return skills;
    }
}