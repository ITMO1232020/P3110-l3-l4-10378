public class ExistException extends NullPointerException {
    private String trouble;
    ExistException(){
        trouble = "Не проинициализированная сущность";
    }

    ExistException(String s){
        super(s);
        trouble = s + trouble;
    }


    public String getExc() {
        return trouble;
    }
}