import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,String> employeeMap = new HashMap<Integer,String>();
        employeeMap.put(1,"Edem");
        employeeMap.put(2,"Anna");
        employeeMap.put(3,"Vova");
        employeeMap.put(4,"Khristya");
        employeeMap.put(5,"Roman");
        employeeMap.put(6,"Roman");
        employeeMap.put(7,"Polina");

        for ( Map.Entry entry: employeeMap.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        System.out.println("Enter key:");
        int key = Integer.parseInt(br.readLine());
        if(employeeMap.containsKey(key)){
            for ( Map.Entry entry: employeeMap.entrySet()){
                if((int)entry.getKey()== key){
                    System.out.println(entry.getKey()+","+entry.getValue());
                }
            }
        }else System.out.println("No corresponding name!");

        System.out.println("Enter value:");
        String value = br.readLine();
        if(employeeMap.containsValue(value)){
            for ( Map.Entry entry: employeeMap.entrySet()) {

                if(entry.getValue().equals(value)){
                    System.out.println(entry.getKey()+","+entry.getValue());
                }
            }
        }else System.out.println("No corresponding ID!");

    }
}
