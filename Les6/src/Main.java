import animal.*;
import person.*;
public class Main {

    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Rex");
        animals[1] = new Dog("Max");
        animals[2] = new Cat("Pet");
        animals[3] = new Cat("Lil");
        animals[0].voice();
        animals[2].voice();
        for (int i =0;i<animals.length;i++){
           if(!animals[i].feed()){
               System.out.println((animals[i]).getName()+ " is not fed!!");
           }
        }
        System.out.println();
        Person[] people = new Person[6];
        people[0] = new Student();
        people[1] = new Student();
        people[2] = new Student();
        people[3] = new Teacher();
        people[4] = new Teacher();
        people[5] = new Cleaner();
        for (Person i : people){
            i.print();
            if(i.getTypePerson() == "Teacher"){
                ((Teacher)i).salary();
            }
            else if(i.getTypePerson() == "Cleaner"){
                ((Cleaner)i).salary();
            }
        }

    }
}
