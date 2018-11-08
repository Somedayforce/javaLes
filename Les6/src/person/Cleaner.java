package person;
public class Cleaner extends Staff {
    private final static String TYPE_PERSON = "Cleaner";

    public String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public void salary() {
        System.out.println("I make 3000 buks ");
    }

    @Override
    public void print() {
        System.out.println("I am " + getTypePerson());
    }

    public Cleaner(){
        System.out.println(this.getTypePerson());
    }

}
