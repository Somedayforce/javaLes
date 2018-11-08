import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int month_days[ ]  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31} ;
        System.out.println("Enter month:");
        int month = Integer.parseInt(br.readLine());
        System.out.println("This month has " + month_days[month-1] + " days");
        int[] test = new int[10];
        System.out.println("Enter array:");
        for (int i =0;i<test.length;i++){
            test[i]=Integer.parseInt(br.readLine());
        }
        boolean check = true;
        int result =0;
        for (int i=0;i<5;i++){
            if(test[i]<0){
                check = false;
                break;
            }
        }
        if(check){
            for (int i=0;i<5;i++) {
            result += test[i];
            }
        }else for (int i=5;i<10;i++) {
            result = 1;
            result *= test[i];
        }
        System.out.println("Result is "+ result);
        System.out.println();


        int[] test2 = {-3,-5,3,5,2,6,9,-4,-6,8};
        int max = 0;
        int sum = 0;
        int countPos = 0;
        int countNeg = 0;
        for ( int i:test2){
            if(max<i){
                max = i;
            }
            if (i > 0) {
                sum +=i;
                countPos++;
            }else countNeg++;

        }
        System.out.println("Max element is " + max);
        System.out.println("Sum of unsigned is " + sum);
        System.out.println("Count of signed is " + countNeg);
        if(countNeg<countPos){
            System.out.println("There are more positive values");
        }else System.out.println("There are mote negative values");

        Employee[] emp = new Employee[5];
        emp[0]= new Employee("Edem",101,300);
        emp[1]= new Employee("Anna",102,450);
        emp[2]= new Employee("Khristya",103,450);
        emp[3]= new Employee("Vova",104,200);
        emp[4]= new Employee("Roman",104,230);
        System.out.println("Enter department number:");
        int dep = Integer.parseInt(br.readLine());
        System.out.println("In "+dep+" department work :");
        for ( int i=0; i<5;i++){
            if (emp[i].getDepartNum() == dep ){
                System.out.println(emp[i].getName());
            }
        }
        System.out.println("Order by salary:");
        Employee.sortSalary(emp);
        for ( int i=0; i<5;i++){
                System.out.println(emp[i].getName());
        }

    }
}
