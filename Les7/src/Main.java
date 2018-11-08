import java.util.*;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        List<Integer> mycollection = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            mycollection.add(rand.nextInt(25));
        }
        for (Object object : mycollection) {
            int element = (int) object;
            System.out.println(element);
        }
        System.out.println("============");
        List<Integer> newcollection = new ArrayList<Integer>();
        for (int i = 0; i < mycollection.size(); i++) {
            if ((int) mycollection.get(i) > 5) {
                newcollection.add(i);
            }
        }
        for (Integer i : newcollection) {
            System.out.println(i);
        }
        System.out.println("============");
        for (int i = 0; i < mycollection.size(); i++) {
            if ((int) mycollection.get(i) > 20) {
                mycollection.remove(i);
                i--;
            }
        }
        for (int i=0;i<mycollection.size();i++){
            System.out.println(mycollection.get(i));
        }
        System.out.println("============");

        mycollection.add(2,3);
        mycollection.add(8,-3);
        mycollection.add(5,-4);
        for (int i=0;i<mycollection.size();i++){

            System.out.println("position - " +i + " ,value of element" + mycollection.get(i));
        }
        System.out.println("============");

        Collections.sort(mycollection);
        for (int i=0;i<mycollection.size();i++){

            System.out.println("position - " +i + " ,value of element" + mycollection.get(i));
        }
    }
}
