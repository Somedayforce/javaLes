package person;
public class Student extends Person{

    private final static String TYPE_PERSON = "Student";

    public String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("I am " + getTypePerson());
    }

    public Student(){
        System.out.println(this.getTypePerson());
    }
}