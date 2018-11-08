package animal;
import java.util.Random;

public class Dog implements Animal{
    private String name;

    public String getName() {
        return name;
    }
    public Dog(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Gav-gav");
    }

    @Override
    public boolean feed() {
        Random ran = new Random();
        return ran.nextBoolean();
    }



}
