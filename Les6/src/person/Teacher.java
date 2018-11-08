package person;
public class Teacher extends Staff {
    private final static String TYPE_PERSON = "Teacher";

    public String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public void salary() {
        System.out.println("I make 4000 buks ");
    }

    @Override
    public void print() {
        System.out.println("I am " + getTypePerson());
    }

    public Teacher(){
        System.out.println(this.getTypePerson());
    }
}


