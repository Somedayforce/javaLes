package animal;
import java.util.Random;
public class Cat implements Animal{
    private String name;

    public String getName() {
        return name;
    }

    public Cat(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Meaw meaw");;
    }

    @Override
    public boolean feed() {
        Random ran = new Random();
        return ran.nextBoolean();
    }
}

