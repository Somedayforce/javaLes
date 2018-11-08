import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
	float[] test1 = new float[3];
	int[] test2 = new int[3];
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter first array (float):");
	for ( int i=0;i<test1.length;i++){
        System.out.println( "Enter element " + i + ":");
        test1[i]= Float.parseFloat(br.readLine());
    }
    for (int i = 0;i< test1.length; i++) {
        if (!(test1[i] < 5 && test1[i] > -5)) {
            System.out.println("False!");
            break;
        }
        if (i == test1.length -1){
            System.out.println("True!");
        }
    }
        System.out.println("Enter second array (int):");
    for ( int i=0;i<test2.length;i++){
            System.out.println( "Enter element " + i + ":");
            test2[i]= Integer.parseInt(br.readLine());
    }

    int max = test2[0];
    int min = test2[0];
    for ( int i : test2){
        if(i>max){
            max = i;
        }
        if(i<min){
            min = i;
        }
    }
    System.out.println("Max = "+ max);
    System.out.println("Min = "+ min);
    System.out.println();
    System.out.println("Enter error number:");
    int error = Integer.parseInt(br.readLine());
    HTTPError httpError;
    httpError = HTTPError.getError(error);
    if (httpError != null) {
        System.out.println("Error name :" + httpError.getName());
    }

    System.out.println();
    Dog[] dogs = new Dog[3];
    dogs[0] = new Dog("Spook",Breed.Staff,4);
    dogs[1] = new Dog("Max",Breed.Husky,5);
    dogs[2]= new Dog("Rex",Breed.Rotveler,2);
    int imax = 0;
    int fmax = 0;
    if (!(dogs[0].getName() == dogs[1].getName()||dogs[0].getName() == dogs[2].getName()||dogs[2].getName() == dogs[1].getName())){
        System.out.println("Dogs have not got any same names");
    }
    else System.out.println("dogs have sme names");

    for (int i = 0;i<dogs.length;i++){
        if(fmax < dogs[i].getAge()){
            fmax = dogs[i].getAge();
            imax = i;
        }
    }
    System.out.println("Oldest dog is " + dogs[imax].getName()+
            ", " + dogs[imax].getBreed() + " and " + dogs[imax].getAge() + "years old");

    }



}
