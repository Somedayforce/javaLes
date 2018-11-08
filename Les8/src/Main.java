import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = new String();
		String substr = new String();
		str = "IT Academy";
		substr = "IT";
		if (str.contains(substr)){
			System.out.println("True!");

		}else System.out.println("False!");
		System.out.println("======");

		System.out.println("Enter surname,name and patronymic:");
		String fullname = br.readLine();
		String[] arr = fullname.split(" ");
        System.out.println("surname and enitials: "+ arr[0] + " " + arr[1].charAt(0)+". " +arr[2].charAt(0)+ "." );
        System.out.println("name: "+ arr[1]);
        System.out.println("name, middle name and last name: " + " " + arr[1] + " " +arr[2] + " " + arr[0]);
        System.out.println("======");

        String[] arr2 = new String[5];
        System.out.println("Enter 5 names:");
        for (int i= 0;i<arr2.length;i++){
            arr2[i] = br.readLine();
        }
        Pattern p = Pattern.compile("[A_Za-z0-9\\_]{3,15}");
        for ( int i = 0;i<arr2.length;i++) {
            Matcher m = p.matcher(arr2[i]);
            System.out.println(m.matches());
        }
   }
}
