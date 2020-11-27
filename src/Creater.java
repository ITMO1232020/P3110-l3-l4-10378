public abstract class Creater {

    private String name;

    public Creater() {

    }

    public Creater(String nickname) {
        name = nickname;
    }

    public String getName() {
        try {
            if (name != "") {
                return name;
            } else {
                throw new ExistException();
            }
        } catch (ExistException ex) {
            return ex.getExc();
        }
    }
}
